package l2;
public final class m1 {
    public static final m1 f19480c = new m1(0, false);
    public final int f19481a;
    public final boolean f19482b;

    public m1(int i7, boolean z10) {
        this.f19481a = i7;
        this.f19482b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19481a == m1Var.f19481a && this.f19482b == m1Var.f19482b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19481a << 1) + (this.f19482b ? 1 : 0);
    }
}
