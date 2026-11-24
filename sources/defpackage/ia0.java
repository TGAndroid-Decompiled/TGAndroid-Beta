package defpackage;

import java.util.List;
public final class ia0 extends n03 {
    public final List a;

    public ia0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n03) {
            return this.a.equals(((ia0) ((n03) obj)).a);
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
