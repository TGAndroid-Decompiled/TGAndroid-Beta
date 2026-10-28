package b2;
public final class s1 {
    public static final s1 d = new s1(new ag.g(1));
    public static final String e;
    public static final String f3432f;
    public static final String f3433g;
    public final int f3434a;
    public final boolean f3435b;
    public final boolean f3436c;

    static {
        String str = e2.n0.f9691a;
        e = Integer.toString(1, 36);
        f3432f = Integer.toString(2, 36);
        f3433g = Integer.toString(3, 36);
    }

    public s1(ag.g gVar) {
        this.f3434a = gVar.f1279a;
        this.f3435b = gVar.f1280b;
        this.f3436c = gVar.f1281c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f3434a == s1Var.f3434a && this.f3435b == s1Var.f3435b && this.f3436c == s1Var.f3436c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3434a + 31) * 31) + (this.f3435b ? 1 : 0)) * 31) + (this.f3436c ? 1 : 0);
    }
}
