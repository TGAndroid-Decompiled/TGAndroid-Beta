package b2;
public final class r1 {
    public static final r1 d = new r1(new af.l(1));
    public static final String e;
    public static final String f3976f;
    public static final String f3977g;
    public final int f3978a;
    public final boolean f3979b;
    public final boolean f3980c;

    static {
        String str = e2.m0.f8254a;
        e = Integer.toString(1, 36);
        f3976f = Integer.toString(2, 36);
        f3977g = Integer.toString(3, 36);
    }

    public r1(af.l lVar) {
        this.f3978a = lVar.f592a;
        this.f3979b = lVar.f593b;
        this.f3980c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3978a == r1Var.f3978a && this.f3979b == r1Var.f3979b && this.f3980c == r1Var.f3980c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3978a + 31) * 31) + (this.f3979b ? 1 : 0)) * 31) + (this.f3980c ? 1 : 0);
    }
}
