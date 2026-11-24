package defpackage;
public final class of3 {
    public static final of3 c = new of3(new kg7((byte) 18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public of3(kg7 kg7Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof of3) {
                of3 of3Var = (of3) obj;
                if (this.a == of3Var.a && this.b == of3Var.b) {
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
