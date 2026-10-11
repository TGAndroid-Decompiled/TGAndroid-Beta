package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14458a;
    public final boolean f14459b;
    public final boolean f14460c;

    public e(ac.d dVar) {
        this.f14458a = dVar.f409a;
        this.f14459b = dVar.f410b;
        this.f14460c = dVar.f411c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14458a == eVar.f14458a && this.f14459b == eVar.f14459b && this.f14460c == eVar.f14460c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14458a ? 1 : 0) << 2) + ((this.f14459b ? 1 : 0) << 1) + (this.f14460c ? 1 : 0);
    }
}
