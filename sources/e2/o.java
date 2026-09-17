package e2;
public final class o {
    public final Object f8792a;
    public b2.p f8793b = new b2.p();
    public boolean f8794c;
    public boolean d;

    public o(Object obj) {
        this.f8792a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8792a.equals(((o) obj).f8792a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8792a.hashCode();
    }
}
