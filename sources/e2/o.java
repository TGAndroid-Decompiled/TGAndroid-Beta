package e2;
public final class o {
    public static final o f10408c = new o(new Object());
    public static final String d;
    public static final String f10409e;
    public final int f10410a = 0;
    public final int f10411b = 0;

    static {
        String str = h2.m0.f14114a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f10409e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.f10410a == oVar.f10410a && this.f10411b == oVar.f10411b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f10410a) * 31) + this.f10411b) * 31;
    }
}
