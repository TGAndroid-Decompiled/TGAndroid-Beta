package h2;
public final class q {
    public final Object f13810a;
    public ca.i f13811b = new ca.i();
    public boolean f13812c;
    public boolean d;

    public q(Object obj) {
        this.f13810a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13810a.equals(((q) obj).f13810a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13810a.hashCode();
    }
}
