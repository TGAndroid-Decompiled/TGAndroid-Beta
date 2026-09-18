package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f3170f;
    public static final String f3171g;
    public final int f3172a;
    public final boolean f3173b;
    public final boolean f3174c;

    static {
        String str = e2.d0.f7888a;
        e = Integer.toString(1, 36);
        f3170f = Integer.toString(2, 36);
        f3171g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3172a = n1Var.f3164a;
        this.f3173b = n1Var.f3165b;
        this.f3174c = n1Var.f3166c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3172a == o1Var.f3172a && this.f3173b == o1Var.f3173b && this.f3174c == o1Var.f3174c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3172a + 31) * 31) + (this.f3173b ? 1 : 0)) * 31) + (this.f3174c ? 1 : 0);
    }
}
