package i2;
public final class p1 {
    public static final p1 f12532c = new p1(0, false);
    public final int f12533a;
    public final boolean f12534b;

    public p1(int i10, boolean z10) {
        this.f12533a = i10;
        this.f12534b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f12533a == p1Var.f12533a && this.f12534b == p1Var.f12534b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12533a << 1) + (this.f12534b ? 1 : 0);
    }
}
