package i2;
public final class p1 {
    public static final p1 f12530c = new p1(0, false);
    public final int f12531a;
    public final boolean f12532b;

    public p1(int i10, boolean z10) {
        this.f12531a = i10;
        this.f12532b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f12531a == p1Var.f12531a && this.f12532b == p1Var.f12532b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12531a << 1) + (this.f12532b ? 1 : 0);
    }
}
