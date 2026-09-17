package i2;
public final class m1 {
    public static final m1 f11668c = new m1(0, false);
    public final int f11669a;
    public final boolean f11670b;

    public m1(int i10, boolean z10) {
        this.f11669a = i10;
        this.f11670b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f11669a == m1Var.f11669a && this.f11670b == m1Var.f11670b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11669a << 1) + (this.f11670b ? 1 : 0);
    }
}
