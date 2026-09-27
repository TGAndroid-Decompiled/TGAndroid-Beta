package i2;
public final class n1 {
    public static final n1 f10787c = new n1(0, false);
    public final int f10788a;
    public final boolean f10789b;

    public n1(int i10, boolean z10) {
        this.f10788a = i10;
        this.f10789b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f10788a == n1Var.f10788a && this.f10789b == n1Var.f10789b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10788a << 1) + (this.f10789b ? 1 : 0);
    }
}
