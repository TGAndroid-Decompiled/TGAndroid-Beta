package h2;
public final class q {
    public final Object f14138a;
    public ca.i f14139b = new ca.i();
    public boolean f14140c;
    public boolean d;

    public q(Object obj) {
        this.f14138a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f14138a.equals(((q) obj).f14138a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14138a.hashCode();
    }
}
