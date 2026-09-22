package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3169f;
    public static final String f3170g;
    public final int f3171a;
    public final boolean f3172b;
    public final boolean f3173c;

    static {
        String str = e2.d0.f7887a;
        e = Integer.toString(1, 36);
        f3169f = Integer.toString(2, 36);
        f3170g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3171a = n1Var.f3163a;
        this.f3172b = n1Var.f3164b;
        this.f3173c = n1Var.f3165c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3171a == o1Var.f3171a && this.f3172b == o1Var.f3172b && this.f3173c == o1Var.f3173c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3171a + 31) * 31) + (this.f3172b ? 1 : 0)) * 31) + (this.f3173c ? 1 : 0);
    }
}
