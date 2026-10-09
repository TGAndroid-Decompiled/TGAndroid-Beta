package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14459a;
    public final boolean f14460b;
    public final boolean f14461c;

    public e(ac.d dVar) {
        this.f14459a = dVar.f409a;
        this.f14460b = dVar.f410b;
        this.f14461c = dVar.f411c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14459a == eVar.f14459a && this.f14460b == eVar.f14460b && this.f14461c == eVar.f14461c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14459a ? 1 : 0) << 2) + ((this.f14460b ? 1 : 0) << 1) + (this.f14461c ? 1 : 0);
    }
}
