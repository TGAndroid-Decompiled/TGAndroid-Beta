package i2;
public final class n1 {
    public static final n1 f11752c = new n1(0, false);
    public final int f11753a;
    public final boolean f11754b;

    public n1(int i10, boolean z10) {
        this.f11753a = i10;
        this.f11754b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f11753a == n1Var.f11753a && this.f11754b == n1Var.f11754b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11753a << 1) + (this.f11754b ? 1 : 0);
    }
}
