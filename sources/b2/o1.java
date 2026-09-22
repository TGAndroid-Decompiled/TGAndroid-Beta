package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3167f;
    public static final String f3168g;
    public final int f3169a;
    public final boolean f3170b;
    public final boolean f3171c;

    static {
        String str = e2.d0.f7885a;
        e = Integer.toString(1, 36);
        f3167f = Integer.toString(2, 36);
        f3168g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3169a = n1Var.f3161a;
        this.f3170b = n1Var.f3162b;
        this.f3171c = n1Var.f3163c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3169a == o1Var.f3169a && this.f3170b == o1Var.f3170b && this.f3171c == o1Var.f3171c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3169a + 31) * 31) + (this.f3170b ? 1 : 0)) * 31) + (this.f3171c ? 1 : 0);
    }
}
