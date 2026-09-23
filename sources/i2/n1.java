package i2;
public final class n1 {
    public static final n1 f10784c = new n1(0, false);
    public final int f10785a;
    public final boolean f10786b;

    public n1(int i10, boolean z10) {
        this.f10785a = i10;
        this.f10786b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f10785a == n1Var.f10785a && this.f10786b == n1Var.f10786b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10785a << 1) + (this.f10786b ? 1 : 0);
    }
}
