package defpackage;
public final class j80 extends ly2 {
    public final int a;

    public j80(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ly2) {
            if (this.a == ((j80) ((ly2) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    public final String toString() {
        return de9.l(new StringBuilder("ProfilingTrigger{trigger="), this.a, "}");
    }
}
