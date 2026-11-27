package defpackage;
public final class m5e {
    public final byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte a = k4e.a(j, bArr);
                    byte a2 = k4e.a(j + 1, bArr);
                    m5e m5eVar = b5e.a;
                    if (i > -12 || a > -65 || a2 > -65) {
                        return -1;
                    }
                    i ^= a << 8;
                    i3 = a2 << 16;
                } else {
                    lq5.f();
                    return 0;
                }
            } else {
                byte a3 = k4e.a(j, bArr);
                m5e m5eVar2 = b5e.a;
                if (i > -12 || a3 > -65) {
                    return -1;
                }
                i3 = a3 << 8;
            }
            return i ^ i3;
        }
        m5e m5eVar3 = b5e.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public final boolean b(byte[] r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5e.b(byte[], int, int):boolean");
    }
}
