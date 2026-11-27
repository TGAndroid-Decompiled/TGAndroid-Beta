package defpackage;

import java.util.ArrayDeque;
public final class ya3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final cdc c = new cdc();
    public v34 d;
    public byte e;
    public int f;
    public long g;

    public final boolean a(defpackage.cb3 r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya3.a(cb3):boolean");
    }

    public final long b(cb3 cb3Var, int i) {
        byte[] bArr = this.a;
        cb3Var.c(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
