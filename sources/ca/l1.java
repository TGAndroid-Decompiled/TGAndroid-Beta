package ca;

import java.util.List;
public final class l1 extends p2 {
    public final List f4438a;

    public l1(List list) {
        this.f4438a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2) {
            return this.f4438a.equals(((l1) ((p2) obj)).f4438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4438a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f4438a + "}";
    }
}
