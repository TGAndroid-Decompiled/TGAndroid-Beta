package l2;
public final class m1 {
    public static final m1 f19477c = new m1(0, false);
    public final int f19478a;
    public final boolean f19479b;

    public m1(int i7, boolean z10) {
        this.f19478a = i7;
        this.f19479b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f19478a == m1Var.f19478a && this.f19479b == m1Var.f19479b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19478a << 1) + (this.f19479b ? 1 : 0);
    }
}
