package b2;
public final class l {
    public static final l f3076c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f3077a = 0;
    public final int f3078b = 0;

    static {
        String str = e2.d0.f7870a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f3077a == lVar.f3077a && this.f3078b == lVar.f3078b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3077a) * 31) + this.f3078b) * 31;
    }
}
