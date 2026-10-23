package b2;
public final class p {
    public static final p f3900c = new p(new Object());
    public static final String d;
    public static final String e;
    public final int f3901a = 0;
    public final int f3902b = 0;

    static {
        String str = e2.m0.f8259a;
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
                if (this.f3901a == pVar.f3901a && this.f3902b == pVar.f3902b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3901a) * 31) + this.f3902b) * 31;
    }
}
