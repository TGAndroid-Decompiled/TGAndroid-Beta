package i2;
public final class n1 {
    public static final n1 f11751c = new n1(0, false);
    public final int f11752a;
    public final boolean f11753b;

    public n1(int i10, boolean z10) {
        this.f11752a = i10;
        this.f11753b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f11752a == n1Var.f11752a && this.f11753b == n1Var.f11753b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11752a << 1) + (this.f11753b ? 1 : 0);
    }
}
