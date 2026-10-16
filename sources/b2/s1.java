package b2;
public final class s1 {
    public static final s1 d = new s1(new af.l(1));
    public static final String e;
    public static final String f2369f;
    public static final String f2370g;
    public final int f2371a;
    public final boolean f2372b;
    public final boolean f2373c;

    static {
        String str = e2.m0.f8375a;
        e = Integer.toString(1, 36);
        f2369f = Integer.toString(2, 36);
        f2370g = Integer.toString(3, 36);
    }

    public s1(af.l lVar) {
        this.f2371a = lVar.f592a;
        this.f2372b = lVar.f593b;
        this.f2373c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f2371a == s1Var.f2371a && this.f2372b == s1Var.f2372b && this.f2373c == s1Var.f2373c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2371a + 31) * 31) + (this.f2372b ? 1 : 0)) * 31) + (this.f2373c ? 1 : 0);
    }
}
