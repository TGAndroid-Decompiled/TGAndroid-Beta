package da;
public final class k0 extends z1 {
    public final l0 f7787a;

    public k0(l0 l0Var) {
        this.f7787a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f7787a.equals(((k0) ((z1) obj)).f7787a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7787a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f7787a + "}";
    }
}
