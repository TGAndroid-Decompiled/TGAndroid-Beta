package b2;
public final class c1 {
    public final u f3708a;

    public c1(u uVar) {
        this.f3708a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        return this.f3708a.equals(((c1) obj).f3708a);
    }

    public final int hashCode() {
        return this.f3708a.hashCode();
    }
}
