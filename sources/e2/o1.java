package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10601e;
    public static final String f10602f;
    public static final String f10603g;
    public final int f10604a;
    public final boolean f10605b;
    public final boolean f10606c;

    static {
        String str = h2.l0.f13783a;
        f10601e = Integer.toString(1, 36);
        f10602f = Integer.toString(2, 36);
        f10603g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10604a = fVar.f3226a;
        this.f10605b = fVar.f3227b;
        this.f10606c = fVar.f3228c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10604a == o1Var.f10604a && this.f10605b == o1Var.f10605b && this.f10606c == o1Var.f10606c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10604a + 31) * 31) + (this.f10605b ? 1 : 0)) * 31) + (this.f10606c ? 1 : 0);
    }
}
