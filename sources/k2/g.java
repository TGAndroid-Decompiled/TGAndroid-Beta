package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f14685a;
    public final boolean f14686b;
    public final boolean f14687c;

    public g(bc.d dVar) {
        this.f14685a = dVar.f4250a;
        this.f14686b = dVar.f4251b;
        this.f14687c = dVar.f4252c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f14685a == gVar.f14685a && this.f14686b == gVar.f14686b && this.f14687c == gVar.f14687c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14685a ? 1 : 0) << 2) + ((this.f14686b ? 1 : 0) << 1) + (this.f14687c ? 1 : 0);
    }
}
