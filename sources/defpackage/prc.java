package defpackage;

import java.math.RoundingMode;
public final class prc implements qrc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final l74 a;
    public final wxb b;
    public final sk9 c;
    public final int d;
    public final byte[] e;
    public final xu7 f;
    public final int g;
    public final fm4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public prc(l74 l74Var, wxb wxbVar, sk9 sk9Var) {
        int i;
        this.a = l74Var;
        this.b = wxbVar;
        this.c = sk9Var;
        int i2 = sk9Var.b;
        int max = Math.max(1, i2 / 10);
        this.g = max;
        xu7 xu7Var = new xu7((byte[]) sk9Var.f);
        xu7Var.t();
        int t = xu7Var.t();
        this.d = t;
        int i3 = sk9Var.a;
        int i4 = sk9Var.c;
        int i5 = (((i4 - (i3 << 2)) << 3) / (sk9Var.d * i3)) + 1;
        if (t == i5) {
            int g = g8c.g(max, t);
            this.e = new byte[g * i4];
            this.f = new xu7((t << 1) * i3 * g);
            int i6 = ((i4 * i2) << 3) / t;
            em4 em4Var = new em4();
            em4Var.s = ud7.n("audio/raw");
            em4Var.i = i6;
            em4Var.j = i6;
            em4Var.t = (max << 1) * i3;
            em4Var.M = i3;
            int i7 = sk9Var.e;
            if (i7 == 0) {
                i = -1;
            } else {
                i = i7 << 2;
            }
            em4Var.N = i;
            em4Var.O = i2;
            em4Var.P = 2;
            this.h = new fm4(em4Var);
            return;
        }
        throw av7.a("Expected frames per block: " + i5 + "; got: " + t, null);
    }

    @Override
    public final boolean a(defpackage.ja3 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prc.a(ja3, long):boolean");
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
        urc urcVar = new urc(this.c, this.d, i, j);
        this.a.f0(urcVar);
        fm4 fm4Var = this.h;
        wxb wxbVar = this.b;
        wxbVar.g(fm4Var);
        wxbVar.d(urcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        sk9 sk9Var = this.c;
        long j3 = sk9Var.b;
        String str = g8c.a;
        long b0 = j + g8c.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * sk9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
