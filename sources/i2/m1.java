package i2;
public final class m1 {
    public static final m1 f10789c = new m1(0, false);
    public final int f10790a;
    public final boolean f10791b;

    public m1(int i10, boolean z10) {
        this.f10790a = i10;
        this.f10791b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10790a == m1Var.f10790a && this.f10791b == m1Var.f10791b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10790a << 1) + (this.f10791b ? 1 : 0);
    }
}
