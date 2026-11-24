package defpackage;
public abstract class l0e {
    public static final w0e a;

    static {
        w0e w0eVar;
        if (uzd.f && uzd.e) {
            w0eVar = new w0e((byte) 1);
        } else {
            w0eVar = new w0e((byte) 0);
        }
        a = w0eVar;
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
