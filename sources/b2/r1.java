package b2;
public final class r1 {
    public static final r1 d = new r1(new af.l(1));
    public static final String e;
    public static final String f3978f;
    public static final String f3979g;
    public final int f3980a;
    public final boolean f3981b;
    public final boolean f3982c;

    static {
        String str = e2.m0.f8255a;
        e = Integer.toString(1, 36);
        f3978f = Integer.toString(2, 36);
        f3979g = Integer.toString(3, 36);
    }

    public r1(af.l lVar) {
        this.f3980a = lVar.f592a;
        this.f3981b = lVar.f593b;
        this.f3982c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3980a == r1Var.f3980a && this.f3981b == r1Var.f3981b && this.f3982c == r1Var.f3982c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3980a + 31) * 31) + (this.f3981b ? 1 : 0)) * 31) + (this.f3982c ? 1 : 0);
    }
}
