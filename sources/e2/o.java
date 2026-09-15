package e2;
public final class o {
    public final Object f7908a;
    public b2.p f7909b = new b2.p();
    public boolean f7910c;
    public boolean d;

    public o(Object obj) {
        this.f7908a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7908a.equals(((o) obj).f7908a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7908a.hashCode();
    }
}
