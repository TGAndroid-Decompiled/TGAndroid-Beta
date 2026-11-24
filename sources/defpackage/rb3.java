package defpackage;

import java.util.ArrayDeque;
public final class rb3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final dbc c = new dbc();
    public k44 d;
    public byte e;
    public int f;
    public long g;

    public final boolean a(defpackage.vb3 r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb3.a(vb3):boolean");
    }

    public final long b(vb3 vb3Var, int i) {
        byte[] bArr = this.a;
        vb3Var.c(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
