package b2;
public final class c1 {
    public final u f3715a;

    public c1(u uVar) {
        this.f3715a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f3715a.equals(((c1) obj).f3715a);
    }

    public final int hashCode() {
        return this.f3715a.hashCode();
    }
}
