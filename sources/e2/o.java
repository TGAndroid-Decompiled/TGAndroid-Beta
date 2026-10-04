package e2;
public final class o {
    public final Object f8564a;
    public b2.p f8565b = new b2.p();
    public boolean f8566c;
    public boolean d;

    public o(Object obj) {
        this.f8564a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8564a.equals(((o) obj).f8564a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8564a.hashCode();
    }
}
