package l2;
public final class m1 {
    public static final m1 f19452c = new m1(0, false);
    public final int f19453a;
    public final boolean f19454b;

    public m1(int i7, boolean z10) {
        this.f19453a = i7;
        this.f19454b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19453a == m1Var.f19453a && this.f19454b == m1Var.f19454b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19453a << 1) + (this.f19454b ? 1 : 0);
    }
}
