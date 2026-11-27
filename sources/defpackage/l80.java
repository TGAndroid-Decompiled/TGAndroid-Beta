package defpackage;
public final class l80 extends gz2 {
    public final int a;

    public l80(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gz2) {
            if (this.a == ((l80) ((gz2) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    public final String toString() {
        return uh9.l(new StringBuilder("ProfilingTrigger{trigger="), this.a, "}");
    }
}
