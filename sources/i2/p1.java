package i2;
public final class p1 {
    public static final p1 f12563c = new p1(0, false);
    public final int f12564a;
    public final boolean f12565b;

    public p1(int i10, boolean z10) {
        this.f12564a = i10;
        this.f12565b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f12564a == p1Var.f12564a && this.f12565b == p1Var.f12565b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12564a << 1) + (this.f12565b ? 1 : 0);
    }
}
