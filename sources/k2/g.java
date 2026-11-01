package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f10658a;
    public final boolean f10659b;
    public final boolean f10660c;

    public g(ea.b bVar) {
        this.f10658a = bVar.f6459a;
        this.f10659b = bVar.f6460b;
        this.f10660c = bVar.f6461c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f10658a == gVar.f10658a && this.f10659b == gVar.f10659b && this.f10660c == gVar.f10660c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f10658a ? 1 : 0) << 2) + ((this.f10659b ? 1 : 0) << 1) + (this.f10660c ? 1 : 0);
    }
}
