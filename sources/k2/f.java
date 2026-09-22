package k2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f13248a;
    public final boolean f13249b;
    public final boolean f13250c;

    public f(ac.d dVar) {
        this.f13248a = dVar.f379a;
        this.f13249b = dVar.f380b;
        this.f13250c = dVar.f381c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f13248a == fVar.f13248a && this.f13249b == fVar.f13249b && this.f13250c == fVar.f13250c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13248a ? 1 : 0) << 2) + ((this.f13249b ? 1 : 0) << 1) + (this.f13250c ? 1 : 0);
    }
}
