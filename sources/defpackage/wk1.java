package defpackage;
public final class wk1 {
    public static final char[] a = new char[117];
    public static final byte[] b = new byte[126];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = b;
            if (i < 33) {
                bArr[i] = Byte.MAX_VALUE;
                i++;
            } else {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
        }
    }

    public static void a(char c, int i) {
        if (c != 'u') {
            a[c] = (char) i;
        }
    }
}
