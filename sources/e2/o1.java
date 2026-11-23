package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10633e;
    public static final String f10634f;
    public static final String f10635g;
    public final int f10636a;
    public final boolean f10637b;
    public final boolean f10638c;

    static {
        String str = h2.l0.f13815a;
        f10633e = Integer.toString(1, 36);
        f10634f = Integer.toString(2, 36);
        f10635g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10636a = fVar.f3245a;
        this.f10637b = fVar.f3246b;
        this.f10638c = fVar.f3247c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10636a == o1Var.f10636a && this.f10637b == o1Var.f10637b && this.f10638c == o1Var.f10638c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10636a + 31) * 31) + (this.f10637b ? 1 : 0)) * 31) + (this.f10638c ? 1 : 0);
    }
}
