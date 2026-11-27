package defpackage;

import java.math.RoundingMode;
public final class dwc implements ewc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final g84 a;
    public final x1c b;
    public final go9 c;
    public final int d;
    public final byte[] e;
    public final ey7 f;
    public final int g;
    public final ko4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public dwc(g84 g84Var, x1c x1cVar, go9 go9Var) {
        int i;
        this.a = g84Var;
        this.b = x1cVar;
        this.c = go9Var;
        int i2 = go9Var.b;
        int max = Math.max(1, i2 / 10);
        this.g = max;
        ey7 ey7Var = new ey7((byte[]) go9Var.f);
        ey7Var.t();
        int t = ey7Var.t();
        this.d = t;
        int i3 = go9Var.a;
        int i4 = go9Var.c;
        int i5 = (((i4 - (i3 << 2)) << 3) / (go9Var.d * i3)) + 1;
        if (t == i5) {
            int g = gcc.g(max, t);
            this.e = new byte[g * i4];
            this.f = new ey7((t << 1) * i3 * g);
            int i6 = ((i4 * i2) << 3) / t;
            jo4 jo4Var = new jo4();
            jo4Var.s = dg7.n("audio/raw");
            jo4Var.i = i6;
            jo4Var.j = i6;
            jo4Var.t = (max << 1) * i3;
            jo4Var.M = i3;
            int i7 = go9Var.e;
            if (i7 == 0) {
                i = -1;
            } else {
                i = i7 << 2;
            }
            jo4Var.N = i;
            jo4Var.O = i2;
            jo4Var.P = 2;
            this.h = new ko4(jo4Var);
            return;
        }
        throw hy7.a("Expected frames per block: " + i5 + "; got: " + t, null);
    }

    @Override
    public final boolean a(defpackage.cb3 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.a(cb3, long):boolean");
    }

    @Override
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override
    public final void c(int i, long j) {
        iwc iwcVar = new iwc(this.c, this.d, i, j);
        this.a.m0(iwcVar);
        ko4 ko4Var = this.h;
        x1c x1cVar = this.b;
        x1cVar.g(ko4Var);
        x1cVar.d(iwcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        go9 go9Var = this.c;
        long j3 = go9Var.b;
        String str = gcc.a;
        long b0 = j + gcc.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * go9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
