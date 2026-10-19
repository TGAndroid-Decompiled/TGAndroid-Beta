package b2;
public final class r1 {
    public static final r1 d = new r1(new af.l(1));
    public static final String e;
    public static final String f3974f;
    public static final String f3975g;
    public final int f3976a;
    public final boolean f3977b;
    public final boolean f3978c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(1, 36);
        f3974f = Integer.toString(2, 36);
        f3975g = Integer.toString(3, 36);
    }

    public r1(af.l lVar) {
        this.f3976a = lVar.f592a;
        this.f3977b = lVar.f593b;
        this.f3978c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3976a == r1Var.f3976a && this.f3977b == r1Var.f3977b && this.f3978c == r1Var.f3978c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3976a + 31) * 31) + (this.f3977b ? 1 : 0)) * 31) + (this.f3978c ? 1 : 0);
    }
}
