package e2;
public final class o {
    public final Object f7897a;
    public b2.p f7898b = new b2.p();
    public boolean f7899c;
    public boolean d;

    public o(Object obj) {
        this.f7897a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7897a.equals(((o) obj).f7897a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7897a.hashCode();
    }
}
