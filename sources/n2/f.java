package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21121a;
    public final boolean f21122b;
    public final boolean f21123c;

    public f(ia.a aVar) {
        this.f21121a = aVar.f16208a;
        this.f21122b = aVar.f16209b;
        this.f21123c = aVar.f16210c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21121a == fVar.f21121a && this.f21122b == fVar.f21122b && this.f21123c == fVar.f21123c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21121a ? 1 : 0) << 2) + ((this.f21122b ? 1 : 0) << 1) + (this.f21123c ? 1 : 0);
    }
}
