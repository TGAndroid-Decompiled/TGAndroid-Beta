package k4;

import b2.w;
import b2.w0;
import b2.x0;
import c3.i0;
import c3.q;
import e2.m0;
import e2.x;
import f2.t;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f14076m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f14077n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f14078a;
    public final i0 f14079b;
    public final t f14080c;
    public final int d;
    public final byte[] e;
    public final x f14081f;
    public final int f14082g;
    public final b2.x h;
    public int f14083i;
    public long f14084j;
    public int f14085k;
    public long f14086l;

    public a(q qVar, i0 i0Var, t tVar) {
        this.f14078a = qVar;
        this.f14079b = i0Var;
        this.f14080c = tVar;
        int i10 = tVar.f8907b;
        int max = Math.max(1, i10 / 10);
        this.f14082g = max;
        x xVar = new x(tVar.e);
        xVar.t();
        int t10 = xVar.t();
        this.d = t10;
        int i11 = tVar.f8906a;
        int i12 = tVar.f8908c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (tVar.d * i11)) + 1;
        if (t10 == i13) {
            int g10 = m0.g(max, t10);
            this.e = new byte[g10 * i12];
            this.f14081f = new x(t10 * 2 * i11 * g10);
            int i14 = ((i12 * i10) * 8) / t10;
            w wVar = new w();
            wVar.f2466r = w0.n("audio/raw");
            wVar.h = i14;
            wVar.f2457i = i14;
            wVar.f2467s = max * 2 * i11;
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
        this.f14083i = 0;
        this.f14084j = j10;
        this.f14085k = 0;
        this.f14086l = 0L;
    }

    @Override
    public final boolean b(c3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: k4.a.b(c3.p, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        f fVar = new f(this.f14080c, this.d, i10, j10);
        this.f14078a.K(fVar);
        b2.x xVar = this.h;
        i0 i0Var = this.f14079b;
        i0Var.b(xVar);
        i0Var.e(fVar.e);
    }

    public final void d(int i10) {
        long j10 = this.f14084j;
        long j11 = this.f14086l;
        t tVar = this.f14080c;
        long j12 = tVar.f8907b;
        String str = m0.f8372a;
        long a02 = j10 + m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i11 = i10 * 2 * tVar.f8906a;
        this.f14079b.c(a02, 1, i11, this.f14085k - i11, null);
        this.f14086l += i10;
        this.f14085k -= i11;
    }
}
