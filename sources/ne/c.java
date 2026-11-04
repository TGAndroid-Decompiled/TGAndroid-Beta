package ne;
public final class c {
    public static final char[] f20346a = new char[117];
    public static final byte[] f20347b = new byte[126];

    static {
        for (int i3 = 0; i3 < 32; i3++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f20347b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = Byte.MAX_VALUE;
        }
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
    }

    public static void a(char c2, int i3) {
        if (c2 != 'u') {
            f20346a[c2] = (char) i3;
        }
    }
}
