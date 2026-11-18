package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21093a;
    public final boolean f21094b;
    public final boolean f21095c;

    public f(ia.a aVar) {
        this.f21093a = aVar.f16183a;
        this.f21094b = aVar.f16184b;
        this.f21095c = aVar.f16185c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21093a == fVar.f21093a && this.f21094b == fVar.f21094b && this.f21095c == fVar.f21095c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21093a ? 1 : 0) << 2) + ((this.f21094b ? 1 : 0) << 1) + (this.f21095c ? 1 : 0);
    }
}
