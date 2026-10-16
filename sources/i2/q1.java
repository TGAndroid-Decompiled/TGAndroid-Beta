package i2;
public final class q1 {
    public static final q1 f11146c = new q1(0, false);
    public final int f11147a;
    public final boolean f11148b;

    public q1(int i10, boolean z10) {
        this.f11147a = i10;
        this.f11148b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f11147a == q1Var.f11147a && this.f11148b == q1Var.f11148b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11147a << 1) + (this.f11148b ? 1 : 0);
    }
}
