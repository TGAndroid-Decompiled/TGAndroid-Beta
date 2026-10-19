package e2;
public final class q {
    public final Object f8269a;
    public b2.t f8270b = new b2.t();
    public boolean f8271c;
    public boolean d;

    public q(Object obj) {
        this.f8269a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8269a.equals(((q) obj).f8269a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8269a.hashCode();
    }
}
