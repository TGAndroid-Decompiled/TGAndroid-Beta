package i2;
public final class o1 {
    public static final o1 f12529c = new o1(0, false);
    public final int f12530a;
    public final boolean f12531b;

    public o1(int i10, boolean z10) {
        this.f12530a = i10;
        this.f12531b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f12530a == o1Var.f12530a && this.f12531b == o1Var.f12531b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12530a << 1) + (this.f12531b ? 1 : 0);
    }
}
