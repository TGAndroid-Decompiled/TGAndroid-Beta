package e2;
public final class q {
    public final Object f8271a;
    public b2.t f8272b = new b2.t();
    public boolean f8273c;
    public boolean d;

    public q(Object obj) {
        this.f8271a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8271a.equals(((q) obj).f8271a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8271a.hashCode();
    }
}
