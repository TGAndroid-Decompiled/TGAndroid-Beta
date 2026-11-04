package m4;

import d2.u;
import d2.u0;
import d2.v;
import d2.v0;
import e3.i0;
import e3.q;
import g2.n0;
import g2.y;
import h2.s;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f19066m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f19067n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f19068a;
    public final i0 f19069b;
    public final s f19070c;
    public final int d;
    public final byte[] f19071e;
    public final y f19072f;
    public final int f19073g;
    public final v h;
    public int f19074i;
    public long f19075j;
    public int f19076k;
    public long f19077l;

    public a(q qVar, i0 i0Var, s sVar) {
        this.f19068a = qVar;
        this.f19069b = i0Var;
        this.f19070c = sVar;
        int i3 = sVar.f14177b;
        int max = Math.max(1, i3 / 10);
        this.f19073g = max;
        y yVar = new y(sVar.f14179e);
        yVar.t();
        int t10 = yVar.t();
        this.d = t10;
        int i10 = sVar.f14176a;
        int i11 = sVar.f14178c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (sVar.d * i10)) + 1;
        if (t10 == i12) {
            int g7 = n0.g(max, t10);
            this.f19071e = new byte[g7 * i11];
            this.f19072f = new y(t10 * 2 * i10 * g7);
            int i13 = ((i11 * i3) * 8) / t10;
            u uVar = new u();
            uVar.f8431r = u0.n("audio/raw");
            uVar.h = i13;
            uVar.f8422i = i13;
            uVar.f8432s = max * 2 * i10;
            uVar.J = i10;
            uVar.K = i3;
            uVar.L = 2;
            this.h = new v(uVar);
            return;
        }
        throw v0.a(null, "Expected frames per block: " + i12 + "; got: " + t10);
    }

    @Override
    public final void a(long j10) {
        this.f19074i = 0;
        this.f19075j = j10;
        this.f19076k = 0;
        this.f19077l = 0L;
    }

    @Override
    public final boolean b(e3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: m4.a.b(e3.p, long):boolean");
    }

    @Override
    public final void c(int i3, long j10) {
        e eVar = new e(this.f19070c, this.d, i3, j10);
        this.f19068a.f(eVar);
        v vVar = this.h;
        i0 i0Var = this.f19069b;
        i0Var.g(vVar);
        i0Var.b(eVar.f19089e);
    }

    public final void d(int i3) {
        long j10 = this.f19075j;
        long j11 = this.f19077l;
        s sVar = this.f19070c;
        long j12 = sVar.f14177b;
        String str = n0.f11873a;
        long a02 = j10 + n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
        int i10 = i3 * 2 * sVar.f14176a;
        this.f19069b.d(a02, 1, i10, this.f19076k - i10, null);
        this.f19077l += i3;
        this.f19076k -= i10;
    }
}
