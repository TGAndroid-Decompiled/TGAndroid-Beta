package i2;
public final class s1 {
    public static final s1 f8079c = new s1(0, false);
    public final int f8080a;
    public final boolean f8081b;

    public s1(int i10, boolean z10) {
        this.f8080a = i10;
        this.f8081b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f8080a == s1Var.f8080a && this.f8081b == s1Var.f8081b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8080a << 1) + (this.f8081b ? 1 : 0);
    }
}
