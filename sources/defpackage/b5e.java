package defpackage;
public abstract class b5e {
    public static final m5e a;

    static {
        m5e m5eVar;
        if (k4e.f && k4e.e) {
            m5eVar = new m5e((byte) 1);
        } else {
            m5eVar = new m5e((byte) 0);
        }
        a = m5eVar;
    }

    public static int a(int i, int i2, byte[] bArr) {
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
                    lq5.f();
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
