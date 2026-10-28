package b2;
public final class q {
    public static final q f3351c = new q(new Object());
    public static final String d;
    public static final String e;
    public final int f3352a = 0;
    public final int f3353b = 0;

    static {
        String str = e2.n0.f9691a;
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
                if (this.f3352a == qVar.f3352a && this.f3353b == qVar.f3353b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3352a) * 31) + this.f3353b) * 31;
    }
}
