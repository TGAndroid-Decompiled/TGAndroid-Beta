package b2;
public final class s1 {
    public static final s1 d = new s1(new r1(0));
    public static final String e;
    public static final String f2269f;
    public static final String f2270g;
    public final int f2271a;
    public final boolean f2272b;
    public final boolean f2273c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(1, 36);
        f2269f = Integer.toString(2, 36);
        f2270g = Integer.toString(3, 36);
    }

    public s1(r1 r1Var) {
        this.f2271a = r1Var.f2221a;
        this.f2272b = r1Var.f2222b;
        this.f2273c = r1Var.f2223c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f2271a == s1Var.f2271a && this.f2272b == s1Var.f2272b && this.f2273c == s1Var.f2273c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2271a + 31) * 31) + (this.f2272b ? 1 : 0)) * 31) + (this.f2273c ? 1 : 0);
    }
}
