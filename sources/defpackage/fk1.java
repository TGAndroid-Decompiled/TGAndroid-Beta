package defpackage;
public abstract class fk1 implements pj8 {
    public static fk1 a(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new ak1(str);
                }
                return new dk1(str.charAt(0), str.charAt(1));
            }
            return new ck1(str.charAt(0), (byte) 0);
        }
        return zj1.f;
    }

    public static String d(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Override
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public fk1 c() {
        return new ak1(this);
    }
}
