package h2;
public final class q {
    public final Object f14136a;
    public ca.i f14137b = new ca.i();
    public boolean f14138c;
    public boolean d;

    public q(Object obj) {
        this.f14136a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f14136a.equals(((q) obj).f14136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14136a.hashCode();
    }
}
