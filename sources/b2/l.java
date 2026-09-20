package b2;
public final class l {
    public static final l f3084c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f3085a = 0;
    public final int f3086b = 0;

    static {
        String str = e2.d0.f7888a;
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
                if (this.f3085a == lVar.f3085a && this.f3086b == lVar.f3086b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3085a) * 31) + this.f3086b) * 31;
    }
}
