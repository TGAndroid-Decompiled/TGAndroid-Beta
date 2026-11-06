package e2;
public final class o {
    public static final o f10403c = new o(new Object());
    public static final String d;
    public static final String f10404e;
    public final int f10405a = 0;
    public final int f10406b = 0;

    static {
        String str = h2.m0.f14112a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f10404e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.f10405a == oVar.f10405a && this.f10406b == oVar.f10406b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f10405a) * 31) + this.f10406b) * 31;
    }
}
