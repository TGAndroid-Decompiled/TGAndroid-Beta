package i2;
public final class o1 {
    public static final o1 f12532c = new o1(0, false);
    public final int f12533a;
    public final boolean f12534b;

    public o1(int i10, boolean z10) {
        this.f12533a = i10;
        this.f12534b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f12533a == o1Var.f12533a && this.f12534b == o1Var.f12534b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12533a << 1) + (this.f12534b ? 1 : 0);
    }
}
