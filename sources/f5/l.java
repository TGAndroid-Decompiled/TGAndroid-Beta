package f5;
public final class l {
    public final Object f6598a;
    public c2.u f6599b = new c2.u();
    public boolean f6600c;
    public boolean d;

    public l(Object obj) {
        this.f6598a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.f6598a.equals(((l) obj).f6598a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6598a.hashCode();
    }
}
