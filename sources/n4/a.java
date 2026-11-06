package n4;

import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.j0;
import f3.q;
import h2.m0;
import h2.x;
import i2.s;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f20375m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f20376n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f20377a;
    public final j0 f20378b;
    public final s f20379c;
    public final int d;
    public final byte[] f20380e;
    public final x f20381f;
    public final int f20382g;
    public final u h;
    public int f20383i;
    public long f20384j;
    public int f20385k;
    public long f20386l;

    public a(q qVar, j0 j0Var, s sVar) {
        this.f20377a = qVar;
        this.f20378b = j0Var;
        this.f20379c = sVar;
        int i7 = sVar.f15221b;
        int max = Math.max(1, i7 / 10);
        this.f20382g = max;
        x xVar = new x(sVar.f15223e);
        xVar.t();
        int t6 = xVar.t();
        this.d = t6;
        int i10 = sVar.f15220a;
        int i11 = sVar.f15222c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (sVar.d * i10)) + 1;
        if (t6 == i12) {
            int g10 = m0.g(max, t6);
            this.f20380e = new byte[g10 * i11];
            this.f20381f = new x(t6 * 2 * i10 * g10);
            int i13 = ((i11 * i7) * 8) / t6;
            t tVar = new t();
            tVar.f10563r = s0.n("audio/raw");
            tVar.h = i13;
            tVar.f10554i = i13;
            tVar.f10564s = max * 2 * i10;
            tVar.J = i10;
            tVar.K = i7;
            tVar.L = 2;
            this.h = new u(tVar);
            return;
        }
        throw t0.a(null, "Expected frames per block: " + i12 + "; got: " + t6);
    }

    @Override
    public final boolean a(f3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: n4.a.a(f3.p, long):boolean");
    }

    @Override
    public final void b(long j3) {
        this.f20383i = 0;
        this.f20384j = j3;
        this.f20385k = 0;
        this.f20386l = 0L;
    }

    @Override
    public final void c(int i7, long j3) {
        e eVar = new e(this.f20379c, this.d, i7, j3);
        this.f20377a.f(eVar);
        u uVar = this.h;
        j0 j0Var = this.f20378b;
        j0Var.g(uVar);
        j0Var.d(eVar.f20398e);
    }

    public final void d(int i7) {
        long j3 = this.f20384j;
        long j10 = this.f20386l;
        s sVar = this.f20379c;
        long j11 = sVar.f15221b;
        String str = m0.f14112a;
        long a02 = j3 + m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
        int i10 = i7 * 2 * sVar.f15220a;
        this.f20378b.c(a02, 1, i10, this.f20385k - i10, null);
        this.f20386l += i7;
        this.f20385k -= i10;
    }
}
