package defpackage;
public final class de3 {
    public static final de3 c = new de3(new ie7((byte) 18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = g8c.a;
        d = "1";
        e = "2";
    }

    public de3(ie7 ie7Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof de3) {
                de3 de3Var = (de3) obj;
                if (this.a == de3Var.a && this.b == de3Var.b) {
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
