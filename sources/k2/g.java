package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f10657a;
    public final boolean f10658b;
    public final boolean f10659c;

    public g(ea.b bVar) {
        this.f10657a = bVar.f6459a;
        this.f10658b = bVar.f6460b;
        this.f10659c = bVar.f6461c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f10657a == gVar.f10657a && this.f10658b == gVar.f10658b && this.f10659c == gVar.f10659c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f10657a ? 1 : 0) << 2) + ((this.f10658b ? 1 : 0) << 1) + (this.f10659c ? 1 : 0);
    }
}
