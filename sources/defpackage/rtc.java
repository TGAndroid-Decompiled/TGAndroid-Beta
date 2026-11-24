package defpackage;

import java.math.RoundingMode;
public final class rtc implements stc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final u84 a;
    public final yzb b;
    public final tm9 c;
    public final int d;
    public final byte[] e;
    public final yw7 f;
    public final int g;
    public final go4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public rtc(u84 u84Var, yzb yzbVar, tm9 tm9Var) {
        int i;
        this.a = u84Var;
        this.b = yzbVar;
        this.c = tm9Var;
        int i2 = tm9Var.b;
        int max = Math.max(1, i2 / 10);
        this.g = max;
        yw7 yw7Var = new yw7((byte[]) tm9Var.f);
        yw7Var.t();
        int t = yw7Var.t();
        this.d = t;
        int i3 = tm9Var.a;
        int i4 = tm9Var.c;
        int i5 = (((i4 - (i3 << 2)) << 3) / (tm9Var.d * i3)) + 1;
        if (t == i5) {
            int g = hac.g(max, t);
            this.e = new byte[g * i4];
            this.f = new yw7((t << 1) * i3 * g);
            int i6 = ((i4 * i2) << 3) / t;
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("audio/raw");
            fo4Var.i = i6;
            fo4Var.j = i6;
            fo4Var.t = (max << 1) * i3;
            fo4Var.M = i3;
            int i7 = tm9Var.e;
            if (i7 == 0) {
                i = -1;
            } else {
                i = i7 << 2;
            }
            fo4Var.N = i;
            fo4Var.O = i2;
            fo4Var.P = 2;
            this.h = new go4(fo4Var);
            return;
        }
        throw bx7.a("Expected frames per block: " + i5 + "; got: " + t, null);
    }

    @Override
    public final boolean a(defpackage.vb3 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtc.a(vb3, long):boolean");
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
        wtc wtcVar = new wtc(this.c, this.d, i, j);
        this.a.f0(wtcVar);
        go4 go4Var = this.h;
        yzb yzbVar = this.b;
        yzbVar.g(go4Var);
        yzbVar.d(wtcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        tm9 tm9Var = this.c;
        long j3 = tm9Var.b;
        String str = hac.a;
        long b0 = j + hac.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * tm9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
