package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3164f;
    public static final String f3165g;
    public final int f3166a;
    public final boolean f3167b;
    public final boolean f3168c;

    static {
        String str = e2.d0.f7872a;
        e = Integer.toString(1, 36);
        f3164f = Integer.toString(2, 36);
        f3165g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3166a = n1Var.f3158a;
        this.f3167b = n1Var.f3159b;
        this.f3168c = n1Var.f3160c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3166a == o1Var.f3166a && this.f3167b == o1Var.f3167b && this.f3168c == o1Var.f3168c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3166a + 31) * 31) + (this.f3167b ? 1 : 0)) * 31) + (this.f3168c ? 1 : 0);
    }
}
