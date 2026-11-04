package m2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f18855a;
    public final boolean f18856b;
    public final boolean f18857c;

    public f(ha.a aVar) {
        this.f18855a = aVar.f14364a;
        this.f18856b = aVar.f14365b;
        this.f18857c = aVar.f14366c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f18855a == fVar.f18855a && this.f18856b == fVar.f18856b && this.f18857c == fVar.f18857c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f18855a ? 1 : 0) << 2) + ((this.f18856b ? 1 : 0) << 1) + (this.f18857c ? 1 : 0);
    }
}
