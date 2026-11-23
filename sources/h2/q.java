package h2;
public final class q {
    public final Object f13839a;
    public ca.i f13840b = new ca.i();
    public boolean f13841c;
    public boolean d;

    public q(Object obj) {
        this.f13839a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f13839a.equals(((q) obj).f13839a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13839a.hashCode();
    }
}
