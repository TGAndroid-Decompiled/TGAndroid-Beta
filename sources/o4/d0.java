package o4;
public final class d0 {
    public final int f16294a;
    public final boolean f16295b;

    public d0(int i10, boolean z4) {
        this.f16294a = i10;
        this.f16295b = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d0.class == obj.getClass()) {
                d0 d0Var = (d0) obj;
                if (this.f16294a == d0Var.f16294a && this.f16295b == d0Var.f16295b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f16294a * 31) + (this.f16295b ? 1 : 0);
    }
}
