package defpackage;
public final class a2c {
    public static final a2c d = new a2c(new uz1());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = gcc.a;
        e = "1";
        f = "2";
        g = "3";
    }

    public a2c(uz1 uz1Var) {
        this.a = uz1Var.a;
        this.b = uz1Var.b;
        this.c = uz1Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a2c.class == obj.getClass()) {
            a2c a2cVar = (a2c) obj;
            if (this.a == a2cVar.a && this.b == a2cVar.b && this.c == a2cVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
