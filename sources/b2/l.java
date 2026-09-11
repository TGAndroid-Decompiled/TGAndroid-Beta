package b2;
public final class l {
    public static final l f2134c = new l(new Object());
    public static final String d;
    public static final String f2135e;
    public final int f2136a = 0;
    public final int f2137b = 0;

    static {
        String str = e2.d0.f8737a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f2135e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f2136a == lVar.f2136a && this.f2137b == lVar.f2137b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f2136a) * 31) + this.f2137b) * 31;
    }
}
