package i2;
public final class m1 {
    public static final m1 f10790c = new m1(0, false);
    public final int f10791a;
    public final boolean f10792b;

    public m1(int i10, boolean z10) {
        this.f10791a = i10;
        this.f10792b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10791a == m1Var.f10791a && this.f10792b == m1Var.f10792b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10791a << 1) + (this.f10792b ? 1 : 0);
    }
}
