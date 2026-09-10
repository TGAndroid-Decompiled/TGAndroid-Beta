package b2;
public final class l {
    public static final l f1777c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f1778a = 0;
    public final int f1779b = 0;

    static {
        String str = e2.d0.f7188a;
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
                if (this.f1778a == lVar.f1778a && this.f1779b == lVar.f1779b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f1778a) * 31) + this.f1779b) * 31;
    }
}
