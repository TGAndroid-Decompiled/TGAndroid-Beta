package defpackage;
public final class zj1 extends bk1 {
    public static final zj1 c = new zj1("CharMatcher.any()", (byte) 0);
    public static final zj1 d = new zj1("CharMatcher.ascii()", (byte) 1);
    public static final zj1 e = new zj1("CharMatcher.javaIsoControl()", (byte) 2);
    public static final zj1 f = new zj1("CharMatcher.none()", (byte) 3);
    public final String a;
    public final byte b;

    public zj1(String str, byte b) {
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
    public final fk1 c() {
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
