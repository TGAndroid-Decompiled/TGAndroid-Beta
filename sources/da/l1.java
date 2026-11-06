package da;

import java.util.List;
public final class l1 extends p2 {
    public final List f8412a;

    public l1(List list) {
        this.f8412a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2) {
            return this.f8412a.equals(((l1) ((p2) obj)).f8412a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8412a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f8412a + "}";
    }
}
