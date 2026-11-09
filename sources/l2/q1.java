package l2;
public final class q1 {
    public static final q1 f17997c = new q1(0, false);
    public final int f17998a;
    public final boolean f17999b;

    public q1(int i7, boolean z9) {
        this.f17998a = i7;
        this.f17999b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f17998a == q1Var.f17998a && this.f17999b == q1Var.f17999b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17998a << 1) + (this.f17999b ? 1 : 0);
    }
}
