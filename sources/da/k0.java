package da;
public final class k0 extends z1 {
    public final l0 f8066a;

    public k0(l0 l0Var) {
        this.f8066a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f8066a.equals(((k0) ((z1) obj)).f8066a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8066a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f8066a + "}";
    }
}
