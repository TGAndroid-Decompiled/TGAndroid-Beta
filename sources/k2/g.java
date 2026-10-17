package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f14678a;
    public final boolean f14679b;
    public final boolean f14680c;

    public g(bc.d dVar) {
        this.f14678a = dVar.f4249a;
        this.f14679b = dVar.f4250b;
        this.f14680c = dVar.f4251c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f14678a == gVar.f14678a && this.f14679b == gVar.f14679b && this.f14680c == gVar.f14680c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14678a ? 1 : 0) << 2) + ((this.f14679b ? 1 : 0) << 1) + (this.f14680c ? 1 : 0);
    }
}
