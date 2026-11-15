package l2;
public final class m1 {
    public static final m1 f19085c = new m1(0, false);
    public final int f19086a;
    public final boolean f19087b;

    public m1(int i7, boolean z10) {
        this.f19086a = i7;
        this.f19087b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19086a == m1Var.f19086a && this.f19087b == m1Var.f19087b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19086a << 1) + (this.f19087b ? 1 : 0);
    }
}
