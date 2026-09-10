package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f12086a;
    public final boolean f12087b;
    public final boolean f12088c;

    public e(ac.d dVar) {
        this.f12086a = dVar.f378a;
        this.f12087b = dVar.f379b;
        this.f12088c = dVar.f380c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f12086a == eVar.f12086a && this.f12087b == eVar.f12087b && this.f12088c == eVar.f12088c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f12086a ? 1 : 0) << 2) + ((this.f12087b ? 1 : 0) << 1) + (this.f12088c ? 1 : 0);
    }
}
