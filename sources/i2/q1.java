package i2;
public final class q1 {
    public static final q1 f13712c = new q1(0, false);
    public final int f13713a;
    public final boolean f13714b;

    public q1(int i10, boolean z10) {
        this.f13713a = i10;
        this.f13714b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f13713a == q1Var.f13713a && this.f13714b == q1Var.f13714b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13713a << 1) + (this.f13714b ? 1 : 0);
    }
}
