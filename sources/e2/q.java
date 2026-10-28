package e2;
public final class q {
    public final Object f9706a;
    public b2.u f9707b = new b2.u();
    public boolean f9708c;
    public boolean d;

    public q(Object obj) {
        this.f9706a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f9706a.equals(((q) obj).f9706a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9706a.hashCode();
    }
}
