package l2;
public final class q1 {
    public static final q1 f17996c = new q1(0, false);
    public final int f17997a;
    public final boolean f17998b;

    public q1(int i7, boolean z9) {
        this.f17997a = i7;
        this.f17998b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f17997a == q1Var.f17997a && this.f17998b == q1Var.f17998b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17997a << 1) + (this.f17998b ? 1 : 0);
    }
}
