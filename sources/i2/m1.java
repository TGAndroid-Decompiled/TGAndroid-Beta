package i2;
public final class m1 {
    public static final m1 f10788c = new m1(0, false);
    public final int f10789a;
    public final boolean f10790b;

    public m1(int i10, boolean z10) {
        this.f10789a = i10;
        this.f10790b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10789a == m1Var.f10789a && this.f10790b == m1Var.f10790b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10789a << 1) + (this.f10790b ? 1 : 0);
    }
}
