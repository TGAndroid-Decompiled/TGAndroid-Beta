package d2;
public final class q1 {
    public static final q1 d = new q1(new bd.i(2));
    public static final String f8330e;
    public static final String f8331f;
    public static final String f8332g;
    public final int f8333a;
    public final boolean f8334b;
    public final boolean f8335c;

    static {
        String str = g2.n0.f11873a;
        f8330e = Integer.toString(1, 36);
        f8331f = Integer.toString(2, 36);
        f8332g = Integer.toString(3, 36);
    }

    public q1(bd.i iVar) {
        this.f8333a = iVar.f3232a;
        this.f8334b = iVar.f3233b;
        this.f8335c = iVar.f3234c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f8333a == q1Var.f8333a && this.f8334b == q1Var.f8334b && this.f8335c == q1Var.f8335c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8333a + 31) * 31) + (this.f8334b ? 1 : 0)) * 31) + (this.f8335c ? 1 : 0);
    }
}
