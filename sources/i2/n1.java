package i2;
public final class n1 {
    public static final n1 f11802c = new n1(0, false);
    public final int f11803a;
    public final boolean f11804b;

    public n1(int i10, boolean z10) {
        this.f11803a = i10;
        this.f11804b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f11803a == n1Var.f11803a && this.f11804b == n1Var.f11804b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11803a << 1) + (this.f11804b ? 1 : 0);
    }
}
