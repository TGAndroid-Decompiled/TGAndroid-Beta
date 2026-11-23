package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21186a;
    public final boolean f21187b;
    public final boolean f21188c;

    public f(ia.a aVar) {
        this.f21186a = aVar.f16271a;
        this.f21187b = aVar.f16272b;
        this.f21188c = aVar.f16273c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21186a == fVar.f21186a && this.f21187b == fVar.f21187b && this.f21188c == fVar.f21188c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21186a ? 1 : 0) << 2) + ((this.f21187b ? 1 : 0) << 1) + (this.f21188c ? 1 : 0);
    }
}
