package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f20157a;
    public final boolean f20158b;
    public final boolean f20159c;

    public f(ia.a aVar) {
        this.f20157a = aVar.f15410a;
        this.f20158b = aVar.f15411b;
        this.f20159c = aVar.f15412c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f20157a == fVar.f20157a && this.f20158b == fVar.f20158b && this.f20159c == fVar.f20159c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f20157a ? 1 : 0) << 2) + ((this.f20158b ? 1 : 0) << 1) + (this.f20159c ? 1 : 0);
    }
}
