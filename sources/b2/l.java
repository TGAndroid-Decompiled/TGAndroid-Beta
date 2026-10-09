package b2;
public final class l {
    public static final l f3407c = new l(new Object());
    public static final String d;
    public static final String f3408e;
    public final int f3409a = 0;
    public final int f3410b = 0;

    static {
        String str = e2.d0.f8532a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f3408e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f3409a == lVar.f3409a && this.f3410b == lVar.f3410b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3409a) * 31) + this.f3410b) * 31;
    }
}
