package j4;
public final class r0 {
    public final int f13547a;
    public final boolean f13548b;

    public r0(int i9, boolean z10) {
        this.f13547a = i9;
        this.f13548b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r0.class == obj.getClass()) {
                r0 r0Var = (r0) obj;
                if (this.f13547a == r0Var.f13547a && this.f13548b == r0Var.f13548b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f13547a * 31) + (this.f13548b ? 1 : 0);
    }
}
