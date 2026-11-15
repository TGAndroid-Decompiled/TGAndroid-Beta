package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10286e;
    public static final String f10287f;
    public static final String f10288g;
    public final int f10289a;
    public final boolean f10290b;
    public final boolean f10291c;

    static {
        String str = h2.l0.f13471a;
        f10286e = Integer.toString(1, 36);
        f10287f = Integer.toString(2, 36);
        f10288g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10289a = fVar.f3233a;
        this.f10290b = fVar.f3234b;
        this.f10291c = fVar.f3235c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10289a == o1Var.f10289a && this.f10290b == o1Var.f10290b && this.f10291c == o1Var.f10291c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10289a + 31) * 31) + (this.f10290b ? 1 : 0)) * 31) + (this.f10291c ? 1 : 0);
    }
}
