package e2;
public final class z0 {
    public final s f10816a;

    public z0(s sVar) {
        this.f10816a = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        return this.f10816a.equals(((z0) obj).f10816a);
    }

    public final int hashCode() {
        return this.f10816a.hashCode();
    }
}
