package b2;
public final class s1 {
    public static final s1 d = new s1(new af.l(1));
    public static final String e;
    public static final String f2365f;
    public static final String f2366g;
    public final int f2367a;
    public final boolean f2368b;
    public final boolean f2369c;

    static {
        String str = e2.m0.f8372a;
        e = Integer.toString(1, 36);
        f2365f = Integer.toString(2, 36);
        f2366g = Integer.toString(3, 36);
    }

    public s1(af.l lVar) {
        this.f2367a = lVar.f588a;
        this.f2368b = lVar.f589b;
        this.f2369c = lVar.f590c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f2367a == s1Var.f2367a && this.f2368b == s1Var.f2368b && this.f2369c == s1Var.f2369c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2367a + 31) * 31) + (this.f2368b ? 1 : 0)) * 31) + (this.f2369c ? 1 : 0);
    }
}
