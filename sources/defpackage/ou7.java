package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public abstract class ou7 {
    public static final byte[] c;
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    public static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] d = new byte[128];
    public static final Charset e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= 30) {
                break;
            }
            byte b2 = bArr2[i2];
            if (b2 > 0) {
                c[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = b;
            if (i < 30) {
                byte b3 = bArr3[i];
                if (b3 > 0) {
                    d[b3] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static void a(int i, String str, String str2) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > i) {
                char charAt = str.charAt(i2);
                char charAt2 = str.charAt(i2);
                throw new Exception("Non-encodable character detected: " + charAt + " (Unicode: " + ((int) charAt2) + ") at position #" + i2 + " - " + str2);
            }
        }
    }

    public static void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i4 = 0;
            while (i - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
            i3 = i4;
        }
        while (i3 < i) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    public static void c(int i, int i2, int i3, ys3 ys3Var, StringBuilder sb) {
        int i4;
        int min = Math.min(i2 + i, ys3Var.length());
        int i5 = i;
        while (true) {
            if (i5 < min && ys3Var.b(i5)) {
                f(ys3Var.a(i5), sb);
                i5++;
            } else {
                int i6 = i5;
                while (i6 < min && !ys3Var.b(i6)) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 <= 0) {
                    return;
                }
                byte[] bArr = new byte[i7];
                for (int i8 = i5; i8 < i6; i8++) {
                    bArr[i8 - i5] = (byte) (ys3Var.charAt(i8) & 255);
                }
                if (i5 == i) {
                    i4 = i3;
                } else {
                    i4 = 1;
                }
                b(i7, i4, sb, bArr);
                i5 = i6;
            }
        }
    }

    public static void d(ys3 ys3Var, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append((Object) ys3Var.subSequence(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    public static int e(int r17, int r18, int r19, defpackage.ys3 r20, java.lang.StringBuilder r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou7.e(int, int, int, ys3, java.lang.StringBuilder):int");
    }

    public static void f(int i, StringBuilder sb) {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        } else {
            throw new Exception(uh9.k(i, "ECI number not in valid range from 0..811799, but was "));
        }
    }

    public static boolean g(char c2) {
        if (c2 != ' ') {
            if (c2 < 'a' || c2 > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean h(char c2) {
        if (c2 != ' ') {
            if (c2 < 'A' || c2 > 'Z') {
                return false;
            }
            return true;
        }
        return true;
    }
}
