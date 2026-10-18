package b2;
public final class c1 {
    public final u f3712a;

    public c1(u uVar) {
        this.f3712a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f3712a.equals(((c1) obj).f3712a);
    }

    public final int hashCode() {
        return this.f3712a.hashCode();
    }
}
