package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14455a;
    public final boolean f14456b;
    public final boolean f14457c;

    public e(ac.d dVar) {
        this.f14455a = dVar.f411a;
        this.f14456b = dVar.f412b;
        this.f14457c = dVar.f413c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14455a == eVar.f14455a && this.f14456b == eVar.f14456b && this.f14457c == eVar.f14457c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14455a ? 1 : 0) << 2) + ((this.f14456b ? 1 : 0) << 1) + (this.f14457c ? 1 : 0);
    }
}
