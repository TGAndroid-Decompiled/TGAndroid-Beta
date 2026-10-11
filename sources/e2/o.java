package e2;
public final class o {
    public final Object f8558a;
    public b2.p f8559b = new b2.p();
    public boolean f8560c;
    public boolean d;

    public o(Object obj) {
        this.f8558a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8558a.equals(((o) obj).f8558a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8558a.hashCode();
    }
}
