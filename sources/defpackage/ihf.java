package defpackage;
public abstract class ihf {
    public static final lbd a;

    static {
        if (ghf.e && ghf.d) {
            int i = ndf.a;
        }
        a = new lbd((byte) 4);
    }

    public static int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        int i5 = bArr[i - 1];
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i6 = bArr[i];
                    int i7 = bArr[i + 1];
                    if (i5 <= -12 && i6 <= -65 && i7 <= -65) {
                        i3 = i7 << 16;
                        i5 ^= i6 << 8;
                    } else {
                        return -1;
                    }
                } else {
                    wn4.f();
                    return 0;
                }
            } else {
                int i8 = bArr[i];
                if (i5 <= -12 && i8 <= -65) {
                    i3 = i8 << 8;
                } else {
                    return -1;
                }
            }
            return i5 ^ i3;
        } else if (i5 <= -12) {
            return i5;
        } else {
            return -1;
        }
    }

    public static int b(java.lang.String r9, byte[] r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihf.b(java.lang.String, byte[], int, int):int");
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) >= 65536) {
                                i++;
                            } else {
                                throw new hhf(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        haf.d(i2 + 4294967296L);
        return 0;
    }
}
