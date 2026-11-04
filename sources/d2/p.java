package d2;
public final class p {
    public static final p f8256c = new p(new Object());
    public static final String d;
    public static final String f8257e;
    public final int f8258a = 0;
    public final int f8259b = 0;

    static {
        String str = g2.n0.f11873a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f8257e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public p(w1 w1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.f8258a == pVar.f8258a && this.f8259b == pVar.f8259b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f8258a) * 31) + this.f8259b) * 31;
    }
}
