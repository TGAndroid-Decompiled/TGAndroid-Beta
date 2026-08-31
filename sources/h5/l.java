package h5;
public final class l {
    public final Object f7259a;
    public c2.u f7260b = new c2.u();
    public boolean f7261c;
    public boolean d;

    public l(Object obj) {
        this.f7259a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f7259a.equals(((l) obj).f7259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7259a.hashCode();
    }
}
