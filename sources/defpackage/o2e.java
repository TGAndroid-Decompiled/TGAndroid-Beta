package defpackage;
public abstract class o2e {
    public static final z2e a;

    static {
        z2e z2eVar;
        if (x1e.f && x1e.e) {
            z2eVar = new z2e((byte) 1);
        } else {
            z2eVar = new z2e((byte) 0);
        }
        a = z2eVar;
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
