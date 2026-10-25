package k4;

import b2.w;
import b2.w0;
import b2.x0;
import c3.j0;
import c3.q;
import e2.n0;
import e2.x;
import f2.u;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f16361m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f16362n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f16363a;
    public final j0 f16364b;
    public final u f16365c;
    public final int d;
    public final byte[] e;
    public final x f16366f;
    public final int f16367g;
    public final b2.x h;
    public int f16368i;
    public long f16369j;
    public int f16370k;
    public long f16371l;

    public a(q qVar, j0 j0Var, u uVar) {
        this.f16363a = qVar;
        this.f16364b = j0Var;
        this.f16365c = uVar;
        int i10 = uVar.f10129b;
        int max = Math.max(1, i10 / 10);
        this.f16367g = max;
        x xVar = new x(uVar.e);
        xVar.t();
        int t10 = xVar.t();
        this.d = t10;
        int i11 = uVar.f10128a;
        int i12 = uVar.f10130c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (uVar.d * i11)) + 1;
        if (t10 == i13) {
            int g7 = n0.g(max, t10);
            this.e = new byte[g7 * i12];
            this.f16366f = new x(t10 * 2 * i11 * g7);
            int i14 = ((i12 * i10) * 8) / t10;
            w wVar = new w();
            wVar.f3533r = w0.n("audio/raw");
            wVar.h = i14;
            wVar.f3524i = i14;
            wVar.f3534s = max * 2 * i11;
            wVar.J = i11;
            wVar.K = i10;
            wVar.L = 2;
            this.h = new b2.x(wVar);
            return;
        }
        throw x0.a(null, "Expected frames per block: " + i13 + "; got: " + t10);
    }

    @Override
    public final void a(long j10) {
        this.f16368i = 0;
        this.f16369j = j10;
        this.f16370k = 0;
        this.f16371l = 0L;
    }

    @Override
    public final boolean b(c3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: k4.a.b(c3.p, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        f fVar = new f(this.f16365c, this.d, i10, j10);
        this.f16363a.D1(fVar);
        b2.x xVar = this.h;
        j0 j0Var = this.f16364b;
        j0Var.b(xVar);
        j0Var.e(fVar.e);
    }

    public final void d(int i10) {
        long j10 = this.f16369j;
        long j11 = this.f16371l;
        u uVar = this.f16365c;
        long j12 = uVar.f10129b;
        String str = n0.f9692a;
        long a02 = j10 + n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i11 = i10 * 2 * uVar.f10128a;
        this.f16364b.c(a02, 1, i11, this.f16370k - i11, null);
        this.f16371l += i10;
        this.f16370k -= i11;
    }
}
