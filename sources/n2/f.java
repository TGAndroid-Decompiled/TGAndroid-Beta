package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f20154a;
    public final boolean f20155b;
    public final boolean f20156c;

    public f(ia.a aVar) {
        this.f20154a = aVar.f15407a;
        this.f20155b = aVar.f15408b;
        this.f20156c = aVar.f15409c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f20154a == fVar.f20154a && this.f20155b == fVar.f20155b && this.f20156c == fVar.f20156c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f20154a ? 1 : 0) << 2) + ((this.f20155b ? 1 : 0) << 1) + (this.f20156c ? 1 : 0);
    }
}
