package e2;
public final class o {
    public final Object f8764a;
    public b2.p f8765b = new b2.p();
    public boolean f8766c;
    public boolean d;

    public o(Object obj) {
        this.f8764a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8764a.equals(((o) obj).f8764a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8764a.hashCode();
    }
}
