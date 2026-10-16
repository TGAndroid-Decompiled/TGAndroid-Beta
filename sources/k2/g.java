package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f13883a;
    public final boolean f13884b;
    public final boolean f13885c;

    public g(bc.d dVar) {
        this.f13883a = dVar.f2637a;
        this.f13884b = dVar.f2638b;
        this.f13885c = dVar.f2639c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f13883a == gVar.f13883a && this.f13884b == gVar.f13884b && this.f13885c == gVar.f13885c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13883a ? 1 : 0) << 2) + ((this.f13884b ? 1 : 0) << 1) + (this.f13885c ? 1 : 0);
    }
}
