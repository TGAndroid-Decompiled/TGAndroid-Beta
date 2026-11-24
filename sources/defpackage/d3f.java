package defpackage;
public final class d3f {
    public final byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte a = k2f.a(j, bArr);
                    byte a2 = k2f.a(j + 1, bArr);
                    d3f d3fVar = s2f.a;
                    if (i > -12 || a > -65 || a2 > -65) {
                        return -1;
                    }
                    i ^= a << 8;
                    i3 = a2 << 16;
                } else {
                    zo4.f();
                    return 0;
                }
            } else {
                byte a3 = k2f.a(j, bArr);
                d3f d3fVar2 = s2f.a;
                if (i > -12 || a3 > -65) {
                    return -1;
                }
                i3 = a3 << 8;
            }
            return i ^ i3;
        }
        d3f d3fVar3 = s2f.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public final int b(java.lang.String r26, byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3f.b(java.lang.String, byte[], int, int):int");
    }

    public final boolean c(int r23, int r24, byte[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3f.c(int, int, byte[]):boolean");
    }
}
