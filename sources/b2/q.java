package b2;
public final class q {
    public static final q f2284c = new q(new Object());
    public static final String d;
    public static final String e;
    public final int f2285a = 0;
    public final int f2286b = 0;

    static {
        String str = e2.m0.f8372a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public q(x1 x1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.f2285a == qVar.f2285a && this.f2286b == qVar.f2286b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f2285a) * 31) + this.f2286b) * 31;
    }
}
