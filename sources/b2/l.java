package b2;
public final class l {
    public static final l f3081c = new l(new Object());
    public static final String d;
    public static final String e;
    public final int f3082a = 0;
    public final int f3083b = 0;

    static {
        String str = e2.d0.f7885a;
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
                if (this.f3082a == lVar.f3082a && this.f3083b == lVar.f3083b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3082a) * 31) + this.f3083b) * 31;
    }
}
