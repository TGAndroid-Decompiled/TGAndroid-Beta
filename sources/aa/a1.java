package aa;

import java.util.List;
public final class a1 extends b2 {
    public final List f1023a;

    public a1(List list) {
        this.f1023a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return this.f1023a.equals(((a1) ((b2) obj)).f1023a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1023a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f1023a + "}";
    }
}
