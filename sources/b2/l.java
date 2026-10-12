package b2;
public final class l {
    public static final l f3405c = new l(new Object());
    public static final String d;
    public static final String f3406e;
    public final int f3407a = 0;
    public final int f3408b = 0;

    static {
        String str = e2.d0.f8529a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f3406e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public l(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f3407a == lVar.f3407a && this.f3408b == lVar.f3408b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f3407a) * 31) + this.f3408b) * 31;
    }
}
