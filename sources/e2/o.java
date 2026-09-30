package e2;
public final class o {
    public final Object f7907a;
    public b2.p f7908b = new b2.p();
    public boolean f7909c;
    public boolean d;

    public o(Object obj) {
        this.f7907a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f7907a.equals(((o) obj).f7907a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7907a.hashCode();
    }
}
