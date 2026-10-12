package b2;
public final class d1 {
    public final v f2098a;

    public d1(v vVar) {
        this.f2098a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        return this.f2098a.equals(((d1) obj).f2098a);
    }

    public final int hashCode() {
        return this.f2098a.hashCode();
    }
}
