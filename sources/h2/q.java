package h2;
public final class q {
    public final Object f13495a;
    public ca.i f13496b = new ca.i();
    public boolean f13497c;
    public boolean d;

    public q(Object obj) {
        this.f13495a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13495a.equals(((q) obj).f13495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13495a.hashCode();
    }
}
