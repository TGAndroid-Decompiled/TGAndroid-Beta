package e2;
public final class o1 {
    public static final o1 d = new o1(new bg.f(1));
    public static final String f10630e;
    public static final String f10631f;
    public static final String f10632g;
    public final int f10633a;
    public final boolean f10634b;
    public final boolean f10635c;

    static {
        String str = h2.l0.f13812a;
        f10630e = Integer.toString(1, 36);
        f10631f = Integer.toString(2, 36);
        f10632g = Integer.toString(3, 36);
    }

    public o1(bg.f fVar) {
        this.f10633a = fVar.f3238a;
        this.f10634b = fVar.f3239b;
        this.f10635c = fVar.f3240c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10633a == o1Var.f10633a && this.f10634b == o1Var.f10634b && this.f10635c == o1Var.f10635c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10633a + 31) * 31) + (this.f10634b ? 1 : 0)) * 31) + (this.f10635c ? 1 : 0);
    }
}
