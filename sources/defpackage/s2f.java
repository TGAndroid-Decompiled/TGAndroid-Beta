package defpackage;
public abstract class s2f {
    public static final d3f a;

    static {
        d3f d3fVar;
        if (k2f.e && k2f.d && !kge.a()) {
            d3fVar = new d3f((byte) 1);
        } else {
            d3fVar = new d3f((byte) 0);
        }
        a = d3fVar;
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new b3f(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(int i, int i2, byte[] bArr) {
        int i3;
        int i4 = bArr[i - 1];
        int i5 = i2 - i;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = bArr[i];
                    int i7 = bArr[i + 1];
                    if (i4 > -12 || i6 > -65 || i7 > -65) {
                        return -1;
                    }
                    i4 ^= i6 << 8;
                    i3 = i7 << 16;
                } else {
                    zo4.f();
                    return 0;
                }
            } else {
                int i8 = bArr[i];
                if (i4 > -12 || i8 > -65) {
                    return -1;
                }
                i3 = i8 << 8;
            }
            return i4 ^ i3;
        } else if (i4 > -12) {
            return -1;
        } else {
            return i4;
        }
    }
}
