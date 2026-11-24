package defpackage;

import java.util.List;
public final class i90 extends cz2 {
    public final List a;

    public i90(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cz2) {
            return this.a.equals(((i90) ((cz2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
