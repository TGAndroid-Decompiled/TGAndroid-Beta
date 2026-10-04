package k2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f14393a;
    public final boolean f14394b;
    public final boolean f14395c;

    public f(ac.d dVar) {
        this.f14393a = dVar.f411a;
        this.f14394b = dVar.f412b;
        this.f14395c = dVar.f413c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f14393a == fVar.f14393a && this.f14394b == fVar.f14394b && this.f14395c == fVar.f14395c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14393a ? 1 : 0) << 2) + ((this.f14394b ? 1 : 0) << 1) + (this.f14395c ? 1 : 0);
    }
}
