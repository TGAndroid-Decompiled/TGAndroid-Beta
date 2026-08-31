package o4;
public final class d0 {
    public final int f16456a;
    public final boolean f16457b;

    public d0(int i10, boolean z4) {
        this.f16456a = i10;
        this.f16457b = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d0.class == obj.getClass()) {
                d0 d0Var = (d0) obj;
                if (this.f16456a == d0Var.f16456a && this.f16457b == d0Var.f16457b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f16456a * 31) + (this.f16457b ? 1 : 0);
    }
}
