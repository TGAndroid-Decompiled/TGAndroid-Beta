package e2;
public final class o {
    public static final o f10239c = new o(new Object());
    public static final String d;
    public static final String f10240e;
    public final int f10241a = 0;
    public final int f10242b = 0;

    static {
        String str = h2.l0.f13471a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        f10240e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.f10241a == oVar.f10241a && this.f10242b == oVar.f10242b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f10241a) * 31) + this.f10242b) * 31;
    }
}
