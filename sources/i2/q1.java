package i2;
public final class q1 {
    public static final q1 f11142c = new q1(0, false);
    public final int f11143a;
    public final boolean f11144b;

    public q1(int i10, boolean z10) {
        this.f11143a = i10;
        this.f11144b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f11143a == q1Var.f11143a && this.f11144b == q1Var.f11144b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11143a << 1) + (this.f11144b ? 1 : 0);
    }
}
