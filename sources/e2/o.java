package e2;
public final class o {
    public static final o f10557c = new o(new Object());
    public static final String d;
    public static final String f10558e;
    public final int f10559a = 0;
    public final int f10560b = 0;

    static {
        String str = h2.l0.f13786a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f10558e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.f10559a == oVar.f10559a && this.f10560b == oVar.f10560b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f10559a) * 31) + this.f10560b) * 31;
    }
}
