package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f20729a;
    public final boolean f20730b;
    public final boolean f20731c;

    public f(ia.a aVar) {
        this.f20729a = aVar.f15865a;
        this.f20730b = aVar.f15866b;
        this.f20731c = aVar.f15867c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f20729a == fVar.f20729a && this.f20730b == fVar.f20730b && this.f20731c == fVar.f20731c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f20729a ? 1 : 0) << 2) + ((this.f20730b ? 1 : 0) << 1) + (this.f20731c ? 1 : 0);
    }
}
