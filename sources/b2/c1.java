package b2;
public final class c1 {
    public final u f3711a;

    public c1(u uVar) {
        this.f3711a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f3711a.equals(((c1) obj).f3711a);
    }

    public final int hashCode() {
        return this.f3711a.hashCode();
    }
}
