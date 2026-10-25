package e2;
public final class q {
    public final Object f9707a;
    public b2.u f9708b = new b2.u();
    public boolean f9709c;
    public boolean d;

    public q(Object obj) {
        this.f9707a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f9707a.equals(((q) obj).f9707a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9707a.hashCode();
    }
}
