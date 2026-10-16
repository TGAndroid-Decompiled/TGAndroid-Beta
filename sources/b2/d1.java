package b2;
public final class d1 {
    public final v f2102a;

    public d1(v vVar) {
        this.f2102a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        return this.f2102a.equals(((d1) obj).f2102a);
    }

    public final int hashCode() {
        return this.f2102a.hashCode();
    }
}
