package d2;
public final class b1 {
    public final t f8038a;

    public b1(t tVar) {
        this.f8038a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        return this.f8038a.equals(((b1) obj).f8038a);
    }

    public final int hashCode() {
        return this.f8038a.hashCode();
    }
}
