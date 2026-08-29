package l4;
public final class q0 {
    public final int f14403a;
    public final boolean f14404b;

    public q0(int i10, boolean z10) {
        this.f14403a = i10;
        this.f14404b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q0.class == obj.getClass()) {
                q0 q0Var = (q0) obj;
                if (this.f14403a == q0Var.f14403a && this.f14404b == q0Var.f14404b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f14403a * 31) + (this.f14404b ? 1 : 0);
    }
}
