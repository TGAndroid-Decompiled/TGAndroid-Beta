package e2;
public final class q {
    public final Object f8272a;
    public b2.t f8273b = new b2.t();
    public boolean f8274c;
    public boolean d;

    public q(Object obj) {
        this.f8272a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8272a.equals(((q) obj).f8272a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8272a.hashCode();
    }
}
