package i2;
public final class s1 {
    public static final s1 f8078c = new s1(0, false);
    public final int f8079a;
    public final boolean f8080b;

    public s1(int i10, boolean z10) {
        this.f8079a = i10;
        this.f8080b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f8079a == s1Var.f8079a && this.f8080b == s1Var.f8080b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8079a << 1) + (this.f8080b ? 1 : 0);
    }
}
