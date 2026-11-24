package defpackage;
public final class j90 extends wz2 {
    public final int a;

    public j90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wz2) {
            if (this.a == ((j90) ((wz2) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    public final String toString() {
        return hg9.k(new StringBuilder("ProfilingTrigger{trigger="), this.a, "}");
    }
}
