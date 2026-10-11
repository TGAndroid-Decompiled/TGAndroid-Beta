package i2;
public final class n1 {
    public static final n1 f11801c = new n1(0, false);
    public final int f11802a;
    public final boolean f11803b;

    public n1(int i10, boolean z10) {
        this.f11802a = i10;
        this.f11803b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f11802a == n1Var.f11802a && this.f11803b == n1Var.f11803b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11802a << 1) + (this.f11803b ? 1 : 0);
    }
}
