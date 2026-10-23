package b2;
public final class r1 {
    public static final r1 d = new r1(new af.l(1));
    public static final String e;
    public static final String f3981f;
    public static final String f3982g;
    public final int f3983a;
    public final boolean f3984b;
    public final boolean f3985c;

    static {
        String str = e2.m0.f8259a;
        e = Integer.toString(1, 36);
        f3981f = Integer.toString(2, 36);
        f3982g = Integer.toString(3, 36);
    }

    public r1(af.l lVar) {
        this.f3983a = lVar.f592a;
        this.f3984b = lVar.f593b;
        this.f3985c = lVar.f594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3983a == r1Var.f3983a && this.f3984b == r1Var.f3984b && this.f3985c == r1Var.f3985c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3983a + 31) * 31) + (this.f3984b ? 1 : 0)) * 31) + (this.f3985c ? 1 : 0);
    }
}
