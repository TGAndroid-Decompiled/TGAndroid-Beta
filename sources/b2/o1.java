package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3162f;
    public static final String f3163g;
    public final int f3164a;
    public final boolean f3165b;
    public final boolean f3166c;

    static {
        String str = e2.d0.f7871a;
        e = Integer.toString(1, 36);
        f3162f = Integer.toString(2, 36);
        f3163g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3164a = n1Var.f3156a;
        this.f3165b = n1Var.f3157b;
        this.f3166c = n1Var.f3158c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3164a == o1Var.f3164a && this.f3165b == o1Var.f3165b && this.f3166c == o1Var.f3166c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3164a + 31) * 31) + (this.f3165b ? 1 : 0)) * 31) + (this.f3166c ? 1 : 0);
    }
}
