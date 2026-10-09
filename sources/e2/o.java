package e2;
public final class o {
    public final Object f8559a;
    public b2.p f8560b = new b2.p();
    public boolean f8561c;
    public boolean d;

    public o(Object obj) {
        this.f8559a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8559a.equals(((o) obj).f8559a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8559a.hashCode();
    }
}
