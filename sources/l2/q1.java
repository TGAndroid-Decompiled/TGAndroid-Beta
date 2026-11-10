package l2;
public final class q1 {
    public static final q1 f18000c = new q1(0, false);
    public final int f18001a;
    public final boolean f18002b;

    public q1(int i7, boolean z9) {
        this.f18001a = i7;
        this.f18002b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f18001a == q1Var.f18001a && this.f18002b == q1Var.f18002b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18001a << 1) + (this.f18002b ? 1 : 0);
    }
}
