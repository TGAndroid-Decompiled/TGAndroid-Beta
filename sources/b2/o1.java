package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String f3498e;
    public static final String f3499f;
    public static final String f3500g;
    public final int f3501a;
    public final boolean f3502b;
    public final boolean f3503c;

    static {
        String str = e2.d0.f8531a;
        f3498e = Integer.toString(1, 36);
        f3499f = Integer.toString(2, 36);
        f3500g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f3501a = n1Var.f3492a;
        this.f3502b = n1Var.f3493b;
        this.f3503c = n1Var.f3494c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f3501a == o1Var.f3501a && this.f3502b == o1Var.f3502b && this.f3503c == o1Var.f3503c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3501a + 31) * 31) + (this.f3502b ? 1 : 0)) * 31) + (this.f3503c ? 1 : 0);
    }
}
