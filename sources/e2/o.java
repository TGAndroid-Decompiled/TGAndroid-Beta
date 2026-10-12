package e2;
public final class o {
    public final Object f8556a;
    public b2.p f8557b = new b2.p();
    public boolean f8558c;
    public boolean d;

    public o(Object obj) {
        this.f8556a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f8556a.equals(((o) obj).f8556a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8556a.hashCode();
    }
}
