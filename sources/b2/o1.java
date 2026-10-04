package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String f3419e;
    public static final String f3420f;
    public static final String f3421g;
    public final int f3422a;
    public final boolean f3423b;
    public final boolean f3424c;

    static {
        String str = e2.d0.f8538a;
        f3419e = Integer.toString(1, 36);
        f3420f = Integer.toString(2, 36);
        f3421g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3422a = n1Var.f3413a;
        this.f3423b = n1Var.f3414b;
        this.f3424c = n1Var.f3415c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3422a == o1Var.f3422a && this.f3423b == o1Var.f3423b && this.f3424c == o1Var.f3424c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3422a + 31) * 31) + (this.f3423b ? 1 : 0)) * 31) + (this.f3424c ? 1 : 0);
    }
}
