package e2;
public final class o {
    public final Object f7896a;
    public b2.p f7897b = new b2.p();
    public boolean f7898c;
    public boolean d;

    public o(Object obj) {
        this.f7896a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7896a.equals(((o) obj).f7896a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7896a.hashCode();
    }
}
