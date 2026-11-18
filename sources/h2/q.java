package h2;
public final class q {
    public final Object f13807a;
    public ca.i f13808b = new ca.i();
    public boolean f13809c;
    public boolean d;

    public q(Object obj) {
        this.f13807a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13807a.equals(((q) obj).f13807a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13807a.hashCode();
    }
}
