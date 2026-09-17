package i2;
public final class m1 {
    public static final m1 f11642c = new m1(0, false);
    public final int f11643a;
    public final boolean f11644b;

    public m1(int i10, boolean z10) {
        this.f11643a = i10;
        this.f11644b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f11643a == m1Var.f11643a && this.f11644b == m1Var.f11644b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11643a << 1) + (this.f11644b ? 1 : 0);
    }
}
