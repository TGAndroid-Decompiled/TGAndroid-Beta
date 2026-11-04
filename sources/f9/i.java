package f9;
public abstract class i implements l {
    public static String a(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static i b(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new c(str);
                }
                return new f(str.charAt(0), str.charAt(1));
            }
            return new e(str.charAt(0), 0);
        }
        return b.f11503f;
    }

    public abstract boolean c(char c2);

    public i d() {
        return new c(this);
    }
}
