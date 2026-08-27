package h9;

import java.util.List;

public final class y0 extends z1 {

    public final List f8854a;

    public y0(List list) {
        this.f8854a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        return this.f8854a.equals(((y0) ((z1) obj)).f8854a);
    }

    public final int hashCode() {
        return this.f8854a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f8854a + "}";
    }
}
