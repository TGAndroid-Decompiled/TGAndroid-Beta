package k4;

import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.l0;
import c3.s;
import e2.m0;
import e2.x;
import f2.u;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f14926m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f14927n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final s f14928a;
    public final l0 f14929b;
    public final u f14930c;
    public final int d;
    public final byte[] e;
    public final x f14931f;
    public final int f14932g;
    public final w h;
    public int f14933i;
    public long f14934j;
    public int f14935k;
    public long f14936l;

    public a(s sVar, l0 l0Var, u uVar) {
        this.f14928a = sVar;
        this.f14929b = l0Var;
        this.f14930c = uVar;
        int i10 = uVar.f10370b;
        int max = Math.max(1, i10 / 10);
        this.f14932g = max;
        x xVar = new x(uVar.e);
        xVar.t();
        int t10 = xVar.t();
        this.d = t10;
        int i11 = uVar.f10369a;
        int i12 = uVar.f10371c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (uVar.d * i11)) + 1;
        if (t10 == i13) {
            int g10 = m0.g(max, t10);
            this.e = new byte[g10 * i12];
            this.f14931f = new x(t10 * 2 * i11 * g10);
            int i14 = ((i12 * i10) * 8) / t10;
            v vVar = new v();
            vVar.f4082r = v0.n("audio/raw");
            vVar.h = i14;
            vVar.f4073i = i14;
            vVar.f4083s = max * 2 * i11;
            vVar.J = i11;
            vVar.K = i10;
            vVar.L = 2;
            this.h = new w(vVar);
            return;
        }
        throw w0.a(null, "Expected frames per block: " + i13 + "; got: " + t10);
    }

    @Override
    public final void a(long j10) {
        this.f14933i = 0;
        this.f14934j = j10;
        this.f14935k = 0;
        this.f14936l = 0L;
    }

    @Override
    public final boolean b(c3.r r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: k4.a.b(c3.r, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        f fVar = new f(this.f14930c, this.d, i10, j10);
        this.f14928a.g0(fVar);
        w wVar = this.h;
        l0 l0Var = this.f14929b;
        l0Var.b(wVar);
        l0Var.e(fVar.e);
    }

    public final void d(int i10) {
        long j10 = this.f14934j;
        long j11 = this.f14936l;
        u uVar = this.f14930c;
        long j12 = uVar.f10370b;
        String str = m0.f8259a;
        long a02 = j10 + m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i11 = i10 * 2 * uVar.f10369a;
        this.f14929b.c(a02, 1, i11, this.f14935k - i11, null);
        this.f14936l += i10;
        this.f14935k -= i11;
    }
}
