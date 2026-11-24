package defpackage;
public abstract class q0f {
    public static final b1f a;

    static {
        b1f b1fVar;
        if (i0f.e && i0f.d && !jee.a()) {
            b1fVar = new b1f((byte) 1);
        } else {
            b1fVar = new b1f((byte) 0);
        }
        a = b1fVar;
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
                                throw new z0f(i2, length2);
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
                    wn4.f();
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
