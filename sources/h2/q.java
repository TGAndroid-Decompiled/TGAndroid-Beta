package h2;
public final class q {
    public final Object f13802a;
    public ca.i f13803b = new ca.i();
    public boolean f13804c;
    public boolean d;

    public q(Object obj) {
        this.f13802a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13802a.equals(((q) obj).f13802a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13802a.hashCode();
    }
}
