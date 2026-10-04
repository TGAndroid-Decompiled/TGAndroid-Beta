package e2;
public final class o {
    public final Object f8565a;
    public b2.p f8566b = new b2.p();
    public boolean f8567c;
    public boolean d;

    public o(Object obj) {
        this.f8565a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8565a.equals(((o) obj).f8565a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8565a.hashCode();
    }
}
