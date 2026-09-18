package e2;
public final class o {
    public final Object f7912a;
    public b2.p f7913b = new b2.p();
    public boolean f7914c;
    public boolean d;

    public o(Object obj) {
        this.f7912a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7912a.equals(((o) obj).f7912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7912a.hashCode();
    }
}
