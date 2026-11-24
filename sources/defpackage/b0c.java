package defpackage;
public final class b0c {
    public static final b0c d = new b0c(new p02());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = hac.a;
        e = "1";
        f = "2";
        g = "3";
    }

    public b0c(p02 p02Var) {
        this.a = p02Var.a;
        this.b = p02Var.b;
        this.c = p02Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0c.class == obj.getClass()) {
            b0c b0cVar = (b0c) obj;
            if (this.a == b0cVar.a && this.b == b0cVar.b && this.c == b0cVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
