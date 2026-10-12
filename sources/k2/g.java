package k2;
public final class g {
    public static final g d = new Object().a();
    public final boolean f13880a;
    public final boolean f13881b;
    public final boolean f13882c;

    public g(bc.d dVar) {
        this.f13880a = dVar.f2633a;
        this.f13881b = dVar.f2634b;
        this.f13882c = dVar.f2635c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f13880a == gVar.f13880a && this.f13881b == gVar.f13881b && this.f13882c == gVar.f13882c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13880a ? 1 : 0) << 2) + ((this.f13881b ? 1 : 0) << 1) + (this.f13882c ? 1 : 0);
    }
}
