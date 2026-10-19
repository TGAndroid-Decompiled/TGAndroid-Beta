package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f14683a;
    public final boolean f14684b;
    public final boolean f14685c;

    public g(bc.d dVar) {
        this.f14683a = dVar.f4246a;
        this.f14684b = dVar.f4247b;
        this.f14685c = dVar.f4248c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f14683a == gVar.f14683a && this.f14684b == gVar.f14684b && this.f14685c == gVar.f14685c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14683a ? 1 : 0) << 2) + ((this.f14684b ? 1 : 0) << 1) + (this.f14685c ? 1 : 0);
    }
}
