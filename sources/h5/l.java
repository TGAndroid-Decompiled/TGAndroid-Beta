package h5;
public final class l {
    public final Object f6957a;
    public c2.u f6958b = new c2.u();
    public boolean f6959c;
    public boolean d;

    public l(Object obj) {
        this.f6957a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f6957a.equals(((l) obj).f6957a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6957a.hashCode();
    }
}
