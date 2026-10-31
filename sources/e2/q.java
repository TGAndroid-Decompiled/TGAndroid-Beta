package e2;
public final class q {
    public final Object f6185a;
    public b2.u f6186b = new b2.u();
    public boolean f6187c;
    public boolean d;

    public q(Object obj) {
        this.f6185a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f6185a.equals(((q) obj).f6185a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6185a.hashCode();
    }
}
