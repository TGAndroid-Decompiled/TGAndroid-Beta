package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10604e;
    public static final String f10605f;
    public static final String f10606g;
    public final int f10607a;
    public final boolean f10608b;
    public final boolean f10609c;

    static {
        String str = h2.l0.f13786a;
        f10604e = Integer.toString(1, 36);
        f10605f = Integer.toString(2, 36);
        f10606g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10607a = fVar.f3225a;
        this.f10608b = fVar.f3226b;
        this.f10609c = fVar.f3227c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10607a == o1Var.f10607a && this.f10608b == o1Var.f10608b && this.f10609c == o1Var.f10609c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10607a + 31) * 31) + (this.f10608b ? 1 : 0)) * 31) + (this.f10609c ? 1 : 0);
    }
}
