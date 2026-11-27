package defpackage;
public final class xe3 {
    public static final xe3 c = new xe3(new sg7((byte) 18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = gcc.a;
        d = "1";
        e = "2";
    }

    public xe3(sg7 sg7Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xe3) {
                xe3 xe3Var = (xe3) obj;
                if (this.a == xe3Var.a && this.b == xe3Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
