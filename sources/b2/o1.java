package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String f2225e;
    public static final String f2226f;
    public static final String f2227g;
    public final int f2228a;
    public final boolean f2229b;
    public final boolean f2230c;

    static {
        String str = e2.d0.f8737a;
        f2225e = Integer.toString(1, 36);
        f2226f = Integer.toString(2, 36);
        f2227g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f2228a = n1Var.f2219a;
        this.f2229b = n1Var.f2220b;
        this.f2230c = n1Var.f2221c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f2228a == o1Var.f2228a && this.f2229b == o1Var.f2229b && this.f2230c == o1Var.f2230c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2228a + 31) * 31) + (this.f2229b ? 1 : 0)) * 31) + (this.f2230c ? 1 : 0);
    }
}
