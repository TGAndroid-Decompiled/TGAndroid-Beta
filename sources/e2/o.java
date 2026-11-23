package e2;
public final class o {
    public static final o f10549c = new o(new Object());
    public static final String d;
    public static final String f10550e;
    public final int f10551a = 0;
    public final int f10552b = 0;

    static {
        String str = h2.l0.f13778a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f10550e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.f10551a == oVar.f10551a && this.f10552b == oVar.f10552b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f10551a) * 31) + this.f10552b) * 31;
    }
}
