package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String f3496e;
    public static final String f3497f;
    public static final String f3498g;
    public final int f3499a;
    public final boolean f3500b;
    public final boolean f3501c;

    static {
        String str = e2.d0.f8529a;
        f3496e = Integer.toString(1, 36);
        f3497f = Integer.toString(2, 36);
        f3498g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3499a = n1Var.f3490a;
        this.f3500b = n1Var.f3491b;
        this.f3501c = n1Var.f3492c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3499a == o1Var.f3499a && this.f3500b == o1Var.f3500b && this.f3501c == o1Var.f3501c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3499a + 31) * 31) + (this.f3500b ? 1 : 0)) * 31) + (this.f3501c ? 1 : 0);
    }
}
