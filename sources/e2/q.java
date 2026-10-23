package e2;
public final class q {
    public final Object f8276a;
    public b2.t f8277b = new b2.t();
    public boolean f8278c;
    public boolean d;

    public q(Object obj) {
        this.f8276a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8276a.equals(((q) obj).f8276a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8276a.hashCode();
    }
}
