package b2;
public final class l {
    public static final l f3083c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f3084a = 0;
    public final int f3085b = 0;

    static {
        String str = e2.d0.f7887a;
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
                if (this.f3084a == lVar.f3084a && this.f3085b == lVar.f3085b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3084a) * 31) + this.f3085b) * 31;
    }
}
