package h2;
public final class q {
    public final Object f13836a;
    public ca.i f13837b = new ca.i();
    public boolean f13838c;
    public boolean d;

    public q(Object obj) {
        this.f13836a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13836a.equals(((q) obj).f13836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13836a.hashCode();
    }
}
