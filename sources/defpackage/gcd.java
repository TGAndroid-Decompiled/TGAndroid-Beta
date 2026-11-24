package defpackage;
public abstract class gcd {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, byte[] bArr) {
        int i2;
        int length = bArr.length;
        int i3 = length << 1;
        if (i > 0) {
            i2 = length / i;
        } else {
            i2 = 0;
        }
        char[] cArr = new char[i3 + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (i > 0 && i5 % i == 0 && i4 > 0) {
                cArr[i4] = '-';
                i4++;
            }
            int i6 = i4 + 1;
            byte b = bArr[i5];
            char[] cArr2 = a;
            cArr[i4] = cArr2[(b & 240) >>> 4];
            i4 += 2;
            cArr[i6] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
