package b2;
public final class p {
    public static final p f3897c = new p(new Object());
    public static final String d;
    public static final String e;
    public final int f3898a = 0;
    public final int f3899b = 0;

    static {
        String str = e2.m0.f8253a;
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
                if (this.f3898a == pVar.f3898a && this.f3899b == pVar.f3899b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3898a) * 31) + this.f3899b) * 31;
    }
}
