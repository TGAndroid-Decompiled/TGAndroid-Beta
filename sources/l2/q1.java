package l2;
public final class q1 {
    public static final q1 f17999c = new q1(0, false);
    public final int f18000a;
    public final boolean f18001b;

    public q1(int i7, boolean z9) {
        this.f18000a = i7;
        this.f18001b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f18000a == q1Var.f18000a && this.f18001b == q1Var.f18001b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18000a << 1) + (this.f18001b ? 1 : 0);
    }
}
