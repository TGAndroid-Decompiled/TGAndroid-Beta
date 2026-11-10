package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f20162a;
    public final boolean f20163b;
    public final boolean f20164c;

    public f(ia.a aVar) {
        this.f20162a = aVar.f15412a;
        this.f20163b = aVar.f15413b;
        this.f20164c = aVar.f15414c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f20162a == fVar.f20162a && this.f20163b == fVar.f20163b && this.f20164c == fVar.f20164c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f20162a ? 1 : 0) << 2) + ((this.f20163b ? 1 : 0) << 1) + (this.f20164c ? 1 : 0);
    }
}
