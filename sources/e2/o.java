package e2;
public final class o {
    public final Object f7213a;
    public b2.p f7214b = new b2.p();
    public boolean f7215c;
    public boolean d;

    public o(Object obj) {
        this.f7213a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7213a.equals(((o) obj).f7213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7213a.hashCode();
    }
}
