package i2;
public final class q1 {
    public static final q1 f13713c = new q1(0, false);
    public final int f13714a;
    public final boolean f13715b;

    public q1(int i10, boolean z10) {
        this.f13714a = i10;
        this.f13715b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f13714a == q1Var.f13714a && this.f13715b == q1Var.f13715b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13714a << 1) + (this.f13715b ? 1 : 0);
    }
}
