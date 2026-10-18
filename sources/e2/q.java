package e2;
public final class q {
    public final Object f8270a;
    public b2.t f8271b = new b2.t();
    public boolean f8272c;
    public boolean d;

    public q(Object obj) {
        this.f8270a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8270a.equals(((q) obj).f8270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8270a.hashCode();
    }
}
