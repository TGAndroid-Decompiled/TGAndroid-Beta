package i2;
public final class l1 {
    public static final l1 f10267c = new l1(0, false);
    public final int f10268a;
    public final boolean f10269b;

    public l1(int i10, boolean z10) {
        this.f10268a = i10;
        this.f10269b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f10268a == l1Var.f10268a && this.f10269b == l1Var.f10269b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10268a << 1) + (this.f10269b ? 1 : 0);
    }
}
