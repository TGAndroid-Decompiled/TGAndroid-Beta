package l2;
public final class m1 {
    public static final m1 f19449c = new m1(0, false);
    public final int f19450a;
    public final boolean f19451b;

    public m1(int i7, boolean z10) {
        this.f19450a = i7;
        this.f19451b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19450a == m1Var.f19450a && this.f19451b == m1Var.f19451b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19450a << 1) + (this.f19451b ? 1 : 0);
    }
}
