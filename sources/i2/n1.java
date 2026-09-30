package i2;
public final class n1 {
    public static final n1 f10798c = new n1(0, false);
    public final int f10799a;
    public final boolean f10800b;

    public n1(int i10, boolean z10) {
        this.f10799a = i10;
        this.f10800b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f10799a == n1Var.f10799a && this.f10800b == n1Var.f10800b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10799a << 1) + (this.f10800b ? 1 : 0);
    }
}
