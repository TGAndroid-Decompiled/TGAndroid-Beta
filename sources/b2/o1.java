package b2;
public final class o1 {
    public static final o1 d = new o1(new n1(0));
    public static final String e;
    public static final String f1863f;
    public static final String f1864g;
    public final int f1865a;
    public final boolean f1866b;
    public final boolean f1867c;

    static {
        String str = e2.d0.f7188a;
        e = Integer.toString(1, 36);
        f1863f = Integer.toString(2, 36);
        f1864g = Integer.toString(3, 36);
    }

    public o1(n1 n1Var) {
        this.f1865a = n1Var.f1857a;
        this.f1866b = n1Var.f1858b;
        this.f1867c = n1Var.f1859c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f1865a == o1Var.f1865a && this.f1866b == o1Var.f1866b && this.f1867c == o1Var.f1867c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1865a + 31) * 31) + (this.f1866b ? 1 : 0)) * 31) + (this.f1867c ? 1 : 0);
    }
}
