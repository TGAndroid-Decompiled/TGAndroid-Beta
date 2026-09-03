package h5;
public final class l {
    public final Object f6944a;
    public c2.u f6945b = new c2.u();
    public boolean f6946c;
    public boolean d;

    public l(Object obj) {
        this.f6944a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f6944a.equals(((l) obj).f6944a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6944a.hashCode();
    }
}
