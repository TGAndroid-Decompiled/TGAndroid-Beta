package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10450e;
    public static final String f10451f;
    public static final String f10452g;
    public final int f10453a;
    public final boolean f10454b;
    public final boolean f10455c;

    static {
        String str = h2.m0.f14112a;
        f10450e = Integer.toString(1, 36);
        f10451f = Integer.toString(2, 36);
        f10452g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10453a = fVar.f3275a;
        this.f10454b = fVar.f3276b;
        this.f10455c = fVar.f3277c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10453a == o1Var.f10453a && this.f10454b == o1Var.f10454b && this.f10455c == o1Var.f10455c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10453a + 31) * 31) + (this.f10454b ? 1 : 0)) * 31) + (this.f10455c ? 1 : 0);
    }
}
