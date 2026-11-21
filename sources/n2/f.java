package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21118a;
    public final boolean f21119b;
    public final boolean f21120c;

    public f(ia.a aVar) {
        this.f21118a = aVar.f16205a;
        this.f21119b = aVar.f16206b;
        this.f21120c = aVar.f16207c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21118a == fVar.f21118a && this.f21119b == fVar.f21119b && this.f21120c == fVar.f21120c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21118a ? 1 : 0) << 2) + ((this.f21119b ? 1 : 0) << 1) + (this.f21120c ? 1 : 0);
    }
}
