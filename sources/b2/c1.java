package b2;
public final class c1 {
    public final v f1995a;

    public c1(v vVar) {
        this.f1995a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f1995a.equals(((c1) obj).f1995a);
    }

    public final int hashCode() {
        return this.f1995a.hashCode();
    }
}
