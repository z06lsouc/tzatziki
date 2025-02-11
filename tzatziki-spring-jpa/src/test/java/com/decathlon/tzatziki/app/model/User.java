package com.decathlon.tzatziki.app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.InheritanceType.JOINED;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "users")
@Inheritance(strategy = JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "birth_date")
    Instant birthDate;

    @Column(name = "updated_at")
    Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "group_id")
    Group group;
}
