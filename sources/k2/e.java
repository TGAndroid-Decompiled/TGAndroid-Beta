package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14456a;
    public final boolean f14457b;
    public final boolean f14458c;

    public e(ac.d dVar) {
        this.f14456a = dVar.f411a;
        this.f14457b = dVar.f412b;
        this.f14458c = dVar.f413c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14456a == eVar.f14456a && this.f14457b == eVar.f14457b && this.f14458c == eVar.f14458c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14456a ? 1 : 0) << 2) + ((this.f14457b ? 1 : 0) << 1) + (this.f14458c ? 1 : 0);
    }
}
