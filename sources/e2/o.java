package e2;
public final class o {
    public final Object f7913a;
    public b2.p f7914b = new b2.p();
    public boolean f7915c;
    public boolean d;

    public o(Object obj) {
        this.f7913a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7913a.equals(((o) obj).f7913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7913a.hashCode();
    }
}
