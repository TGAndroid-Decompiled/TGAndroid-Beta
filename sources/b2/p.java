package b2;
public final class p {
    public static final p f3893c = new p(new Object());
    public static final String d;
    public static final String e;
    public final int f3894a = 0;
    public final int f3895b = 0;

    static {
        String str = e2.m0.f8252a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public p(w1 w1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.f3894a == pVar.f3894a && this.f3895b == pVar.f3895b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3894a) * 31) + this.f3895b) * 31;
    }
}
