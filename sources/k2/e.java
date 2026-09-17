package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14593a;
    public final boolean f14594b;
    public final boolean f14595c;

    public e(ac.d dVar) {
        this.f14593a = dVar.f408a;
        this.f14594b = dVar.f409b;
        this.f14595c = dVar.f410c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14593a == eVar.f14593a && this.f14594b == eVar.f14594b && this.f14595c == eVar.f14595c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14593a ? 1 : 0) << 2) + ((this.f14594b ? 1 : 0) << 1) + (this.f14595c ? 1 : 0);
    }
}
