package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10594e;
    public static final String f10595f;
    public static final String f10596g;
    public final int f10597a;
    public final boolean f10598b;
    public final boolean f10599c;

    static {
        String str = h2.l0.f13778a;
        f10594e = Integer.toString(1, 36);
        f10595f = Integer.toString(2, 36);
        f10596g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10597a = fVar.f3196a;
        this.f10598b = fVar.f3197b;
        this.f10599c = fVar.f3198c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10597a == o1Var.f10597a && this.f10598b == o1Var.f10598b && this.f10599c == o1Var.f10599c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10597a + 31) * 31) + (this.f10598b ? 1 : 0)) * 31) + (this.f10599c ? 1 : 0);
    }
}
