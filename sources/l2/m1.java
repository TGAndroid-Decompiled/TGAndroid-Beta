package l2;
public final class m1 {
    public static final m1 f19446c = new m1(0, false);
    public final int f19447a;
    public final boolean f19448b;

    public m1(int i7, boolean z10) {
        this.f19447a = i7;
        this.f19448b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19447a == m1Var.f19447a && this.f19448b == m1Var.f19448b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19447a << 1) + (this.f19448b ? 1 : 0);
    }
}
