package l2;
public final class n1 {
    public static final n1 f19550c = new n1(0, false);
    public final int f19551a;
    public final boolean f19552b;

    public n1(int i7, boolean z10) {
        this.f19551a = i7;
        this.f19552b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f19551a == n1Var.f19551a && this.f19552b == n1Var.f19552b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19551a << 1) + (this.f19552b ? 1 : 0);
    }
}
