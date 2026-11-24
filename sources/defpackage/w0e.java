package defpackage;
public final class w0e {
    public final byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte a = uzd.a(j, bArr);
                    byte a2 = uzd.a(j + 1, bArr);
                    w0e w0eVar = l0e.a;
                    if (i > -12 || a > -65 || a2 > -65) {
                        return -1;
                    }
                    i ^= a << 8;
                    i3 = a2 << 16;
                } else {
                    wn4.f();
                    return 0;
                }
            } else {
                byte a3 = uzd.a(j, bArr);
                w0e w0eVar2 = l0e.a;
                if (i > -12 || a3 > -65) {
                    return -1;
                }
                i3 = a3 << 8;
            }
            return i ^ i3;
        }
        w0e w0eVar3 = l0e.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public final boolean b(byte[] r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0e.b(byte[], int, int):boolean");
    }
}
