package b2;
public final class l {
    public static final l f3079c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f3080a = 0;
    public final int f3081b = 0;

    static {
        String str = e2.d0.f7883a;
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
                if (this.f3080a == lVar.f3080a && this.f3081b == lVar.f3081b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3080a) * 31) + this.f3081b) * 31;
    }
}
