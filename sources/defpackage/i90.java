package defpackage;
public final class i90 extends xz2 {
    public final j90 a;

    public i90(j90 j90Var) {
        this.a = j90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xz2) {
            return this.a.equals(((i90) ((xz2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.a + "}";
    }
}
