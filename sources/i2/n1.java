package i2;
public final class n1 {
    public static final n1 f11800c = new n1(0, false);
    public final int f11801a;
    public final boolean f11802b;

    public n1(int i10, boolean z10) {
        this.f11801a = i10;
        this.f11802b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f11801a == n1Var.f11801a && this.f11802b == n1Var.f11802b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11801a << 1) + (this.f11802b ? 1 : 0);
    }
}
