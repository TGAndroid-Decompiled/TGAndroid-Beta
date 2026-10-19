package k4;

import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.j0;
import c3.q;
import e2.m0;
import e2.x;
import f2.u;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f14882m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f14883n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f14884a;
    public final j0 f14885b;
    public final u f14886c;
    public final int d;
    public final byte[] e;
    public final x f14887f;
    public final int f14888g;
    public final w h;
    public int f14889i;
    public long f14890j;
    public int f14891k;
    public long f14892l;

    public a(q qVar, j0 j0Var, u uVar) {
        this.f14884a = qVar;
        this.f14885b = j0Var;
        this.f14886c = uVar;
        int i10 = uVar.f10355b;
        int max = Math.max(1, i10 / 10);
        this.f14888g = max;
        x xVar = new x(uVar.e);
        xVar.t();
        int t10 = xVar.t();
        this.d = t10;
        int i11 = uVar.f10354a;
        int i12 = uVar.f10356c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (uVar.d * i11)) + 1;
        if (t10 == i13) {
            int g10 = m0.g(max, t10);
            this.e = new byte[g10 * i12];
            this.f14887f = new x(t10 * 2 * i11 * g10);
            int i14 = ((i12 * i10) * 8) / t10;
            v vVar = new v();
            vVar.f4077r = v0.n("audio/raw");
            vVar.h = i14;
            vVar.f4068i = i14;
            vVar.f4078s = max * 2 * i11;
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
        this.f14889i = 0;
        this.f14890j = j10;
        this.f14891k = 0;
        this.f14892l = 0L;
    }

    @Override
    public final boolean b(c3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: k4.a.b(c3.p, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        f fVar = new f(this.f14886c, this.d, i10, j10);
        this.f14884a.g0(fVar);
        w wVar = this.h;
        j0 j0Var = this.f14885b;
        j0Var.b(wVar);
        j0Var.e(fVar.e);
    }

    public final void d(int i10) {
        long j10 = this.f14890j;
        long j11 = this.f14892l;
        u uVar = this.f14886c;
        long j12 = uVar.f10355b;
        String str = m0.f8254a;
        long a02 = j10 + m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i11 = i10 * 2 * uVar.f10354a;
        this.f14885b.c(a02, 1, i11, this.f14891k - i11, null);
        this.f14892l += i10;
        this.f14891k -= i11;
    }
}
