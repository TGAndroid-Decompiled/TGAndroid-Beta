package e2;
public final class o {
    public final Object f7895a;
    public b2.p f7896b = new b2.p();
    public boolean f7897c;
    public boolean d;

    public o(Object obj) {
        this.f7895a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7895a.equals(((o) obj).f7895a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7895a.hashCode();
    }
}
