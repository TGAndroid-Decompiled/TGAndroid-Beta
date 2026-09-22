package e2;
public final class o {
    public final Object f7910a;
    public b2.p f7911b = new b2.p();
    public boolean f7912c;
    public boolean d;

    public o(Object obj) {
        this.f7910a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7910a.equals(((o) obj).f7910a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7910a.hashCode();
    }
}
