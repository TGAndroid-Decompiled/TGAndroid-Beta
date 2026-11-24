package defpackage;
public final class qj1 extends sj1 {
    public static final qj1 c = new qj1("CharMatcher.any()", (byte) 0);
    public static final qj1 d = new qj1("CharMatcher.ascii()", (byte) 1);
    public static final qj1 e = new qj1("CharMatcher.javaIsoControl()", (byte) 2);
    public static final qj1 f = new qj1("CharMatcher.none()", (byte) 3);
    public final String a;
    public final byte b;

    public qj1(String str, byte b) {
        this.b = b;
        this.a = str;
    }

    @Override
    public final boolean b(char c2) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                if (c2 <= 127) {
                    return true;
                }
                return false;
            case 2:
                if (c2 > 31 && (c2 < 127 || c2 > 159)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final wj1 c() {
        switch (this.b) {
            case 0:
                return f;
            case 3:
                return c;
            default:
                return super.c();
        }
    }

    public final String toString() {
        return this.a;
    }
}
