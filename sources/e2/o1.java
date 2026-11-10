package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10455e;
    public static final String f10456f;
    public static final String f10457g;
    public final int f10458a;
    public final boolean f10459b;
    public final boolean f10460c;

    static {
        String str = h2.m0.f14114a;
        f10455e = Integer.toString(1, 36);
        f10456f = Integer.toString(2, 36);
        f10457g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10458a = fVar.f3275a;
        this.f10459b = fVar.f3276b;
        this.f10460c = fVar.f3277c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10458a == o1Var.f10458a && this.f10459b == o1Var.f10459b && this.f10460c == o1Var.f10460c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10458a + 31) * 31) + (this.f10459b ? 1 : 0)) * 31) + (this.f10460c ? 1 : 0);
    }
}
