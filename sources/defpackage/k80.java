package defpackage;
public final class k80 extends hz2 {
    public final l80 a;

    public k80(l80 l80Var) {
        this.a = l80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hz2) {
            return this.a.equals(((k80) ((hz2) obj)).a);
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
