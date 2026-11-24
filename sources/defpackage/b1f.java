package defpackage;
public final class b1f {
    public final byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte a = i0f.a(j, bArr);
                    byte a2 = i0f.a(j + 1, bArr);
                    b1f b1fVar = q0f.a;
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
                byte a3 = i0f.a(j, bArr);
                b1f b1fVar2 = q0f.a;
                if (i > -12 || a3 > -65) {
                    return -1;
                }
                i3 = a3 << 8;
            }
            return i ^ i3;
        }
        b1f b1fVar3 = q0f.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public final int b(java.lang.String r26, byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1f.b(java.lang.String, byte[], int, int):int");
    }

    public final boolean c(int r23, int r24, byte[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1f.c(int, int, byte[]):boolean");
    }
}
