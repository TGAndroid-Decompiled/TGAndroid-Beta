package defpackage;

import java.util.ArrayDeque;
public final class fa3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final c9c c = new c9c();
    public pj4 d;
    public byte e;
    public int f;
    public long g;

    public final boolean a(defpackage.ja3 r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa3.a(ja3):boolean");
    }

    public final long b(ja3 ja3Var, int i) {
        byte[] bArr = this.a;
        ja3Var.c(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
