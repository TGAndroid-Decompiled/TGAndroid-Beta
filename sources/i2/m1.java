package i2;
public final class m1 {
    public static final m1 f10786c = new m1(0, false);
    public final int f10787a;
    public final boolean f10788b;

    public m1(int i10, boolean z10) {
        this.f10787a = i10;
        this.f10788b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10787a == m1Var.f10787a && this.f10788b == m1Var.f10788b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10787a << 1) + (this.f10788b ? 1 : 0);
    }
}
