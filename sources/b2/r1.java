package b2;
public final class r1 {
    public static final r1 d = new r1(new af.l(1));
    public static final String e;
    public static final String f3977f;
    public static final String f3978g;
    public final int f3979a;
    public final boolean f3980b;
    public final boolean f3981c;

    static {
        String str = e2.m0.f8254a;
        e = Integer.toString(1, 36);
        f3977f = Integer.toString(2, 36);
        f3978g = Integer.toString(3, 36);
    }

    public r1(af.l lVar) {
        this.f3979a = lVar.f592a;
        this.f3980b = lVar.f593b;
        this.f3981c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3979a == r1Var.f3979a && this.f3980b == r1Var.f3980b && this.f3981c == r1Var.f3981c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3979a + 31) * 31) + (this.f3980b ? 1 : 0)) * 31) + (this.f3981c ? 1 : 0);
    }
}
