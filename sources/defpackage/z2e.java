package defpackage;
public final class z2e {
    public final byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    byte a = x1e.a(j, bArr);
                    byte a2 = x1e.a(j + 1, bArr);
                    z2e z2eVar = o2e.a;
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
                byte a3 = x1e.a(j, bArr);
                z2e z2eVar2 = o2e.a;
                if (i > -12 || a3 > -65) {
                    return -1;
                }
                i3 = a3 << 8;
            }
            return i ^ i3;
        }
        z2e z2eVar3 = o2e.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public final boolean b(byte[] r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2e.b(byte[], int, int):boolean");
    }
}
