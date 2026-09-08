package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String f2252e;
    public static final String f2253f;
    public static final String f2254g;
    public final int f2255a;
    public final boolean f2256b;
    public final boolean f2257c;

    static {
        String str = e2.d0.f8765a;
        f2252e = Integer.toString(1, 36);
        f2253f = Integer.toString(2, 36);
        f2254g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f2255a = n1Var.f2246a;
        this.f2256b = n1Var.f2247b;
        this.f2257c = n1Var.f2248c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f2255a == o1Var.f2255a && this.f2256b == o1Var.f2256b && this.f2257c == o1Var.f2257c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2255a + 31) * 31) + (this.f2256b ? 1 : 0)) * 31) + (this.f2257c ? 1 : 0);
    }
}
