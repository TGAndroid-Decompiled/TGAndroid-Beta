package k2;
public final class q1 {
    public static final q1 f16683c = new q1(0, false);
    public final int f16684a;
    public final boolean f16685b;

    public q1(int i3, boolean z10) {
        this.f16684a = i3;
        this.f16685b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f16684a == q1Var.f16684a && this.f16685b == q1Var.f16685b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16684a << 1) + (this.f16685b ? 1 : 0);
    }
}
