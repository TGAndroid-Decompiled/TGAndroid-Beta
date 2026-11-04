package g2;
public final class r {
    public final Object f11897a;
    public ba.i f11898b = new ba.i();
    public boolean f11899c;
    public boolean d;

    public r(Object obj) {
        this.f11897a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            return this.f11897a.equals(((r) obj).f11897a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11897a.hashCode();
    }
}
