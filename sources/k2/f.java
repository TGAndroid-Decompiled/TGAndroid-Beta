package k2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f14392a;
    public final boolean f14393b;
    public final boolean f14394c;

    public f(ac.d dVar) {
        this.f14392a = dVar.f411a;
        this.f14393b = dVar.f412b;
        this.f14394c = dVar.f413c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f14392a == fVar.f14392a && this.f14393b == fVar.f14393b && this.f14394c == fVar.f14394c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14392a ? 1 : 0) << 2) + ((this.f14393b ? 1 : 0) << 1) + (this.f14394c ? 1 : 0);
    }
}
