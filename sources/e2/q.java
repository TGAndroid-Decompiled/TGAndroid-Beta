package e2;
public final class q {
    public final Object f8392a;
    public b2.u f8393b = new b2.u();
    public boolean f8394c;
    public boolean d;

    public q(Object obj) {
        this.f8392a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f8392a.equals(((q) obj).f8392a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8392a.hashCode();
    }
}
