package e2;
public final class q {
    public final Object f8389a;
    public b2.u f8390b = new b2.u();
    public boolean f8391c;
    public boolean d;

    public q(Object obj) {
        this.f8389a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8389a.equals(((q) obj).f8389a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8389a.hashCode();
    }
}
