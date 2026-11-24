package defpackage;
public abstract class el1 implements di8 {
    public static el1 a(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new zk1(str);
                }
                return new cl1(str.charAt(0), str.charAt(1));
            }
            return new bl1(str.charAt(0), (byte) 0);
        }
        return yk1.f;
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

    public el1 c() {
        return new zk1(this);
    }
}
