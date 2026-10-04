package b2;
public final class l {
    public static final l f3328c = new l(new Object());
    public static final String d;
    public static final String f3329e;
    public final int f3330a = 0;
    public final int f3331b = 0;

    static {
        String str = e2.d0.f8537a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f3329e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f3330a == lVar.f3330a && this.f3331b == lVar.f3331b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3330a) * 31) + this.f3331b) * 31;
    }
}
