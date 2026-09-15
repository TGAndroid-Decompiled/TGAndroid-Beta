package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3165f;
    public static final String f3166g;
    public final int f3167a;
    public final boolean f3168b;
    public final boolean f3169c;

    static {
        String str = e2.d0.f7883a;
        e = Integer.toString(1, 36);
        f3165f = Integer.toString(2, 36);
        f3166g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3167a = n1Var.f3159a;
        this.f3168b = n1Var.f3160b;
        this.f3169c = n1Var.f3161c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3167a == o1Var.f3167a && this.f3168b == o1Var.f3168b && this.f3169c == o1Var.f3169c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3167a + 31) * 31) + (this.f3168b ? 1 : 0)) * 31) + (this.f3169c ? 1 : 0);
    }
}
