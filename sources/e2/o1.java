package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10596e;
    public static final String f10597f;
    public static final String f10598g;
    public final int f10599a;
    public final boolean f10600b;
    public final boolean f10601c;

    static {
        String str = h2.l0.f13778a;
        f10596e = Integer.toString(1, 36);
        f10597f = Integer.toString(2, 36);
        f10598g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10599a = fVar.f3196a;
        this.f10600b = fVar.f3197b;
        this.f10601c = fVar.f3198c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10599a == o1Var.f10599a && this.f10600b == o1Var.f10600b && this.f10601c == o1Var.f10601c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10599a + 31) * 31) + (this.f10600b ? 1 : 0)) * 31) + (this.f10601c ? 1 : 0);
    }
}
