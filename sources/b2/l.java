package b2;
public final class l {
    public static final l f2161c = new l(new Object());
    public static final String d;
    public static final String f2162e;
    public final int f2163a = 0;
    public final int f2164b = 0;

    static {
        String str = e2.d0.f8765a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f2162e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f2163a == lVar.f2163a && this.f2164b == lVar.f2164b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f2163a) * 31) + this.f2164b) * 31;
    }
}
