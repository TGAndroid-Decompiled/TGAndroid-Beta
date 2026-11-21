package n4;

import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.i0;
import f3.q;
import h2.l0;
import h2.x;
import i2.s;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f21336m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f21337n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f21338a;
    public final i0 f21339b;
    public final s f21340c;
    public final int d;
    public final byte[] f21341e;
    public final x f21342f;
    public final int f21343g;
    public final u h;
    public int f21344i;
    public long f21345j;
    public int f21346k;
    public long f21347l;

    public a(q qVar, i0 i0Var, s sVar) {
        this.f21338a = qVar;
        this.f21339b = i0Var;
        this.f21340c = sVar;
        int i7 = sVar.f16018b;
        int max = Math.max(1, i7 / 10);
        this.f21343g = max;
        x xVar = new x(sVar.f16020e);
        xVar.t();
        int t6 = xVar.t();
        this.d = t6;
        int i10 = sVar.f16017a;
        int i11 = sVar.f16019c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (sVar.d * i10)) + 1;
        if (t6 == i12) {
            int g10 = l0.g(max, t6);
            this.f21341e = new byte[g10 * i11];
            this.f21342f = new x(t6 * 2 * i10 * g10);
            int i13 = ((i11 * i7) * 8) / t6;
            t tVar = new t();
            tVar.f10743r = s0.n("audio/raw");
            tVar.h = i13;
            tVar.f10734i = i13;
            tVar.f10744s = max * 2 * i10;
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
        this.f21344i = 0;
        this.f21345j = j3;
        this.f21346k = 0;
        this.f21347l = 0L;
    }

    @Override
    public final void c(int i7, long j3) {
        e eVar = new e(this.f21340c, this.d, i7, j3);
        this.f21338a.j(eVar);
        u uVar = this.h;
        i0 i0Var = this.f21339b;
        i0Var.g(uVar);
        i0Var.d(eVar.f21359e);
    }

    public final void d(int i7) {
        long j3 = this.f21345j;
        long j10 = this.f21347l;
        s sVar = this.f21340c;
        long j11 = sVar.f16018b;
        String str = l0.f13812a;
        long a02 = j3 + l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
        int i10 = i7 * 2 * sVar.f16017a;
        this.f21339b.c(a02, 1, i10, this.f21346k - i10, null);
        this.f21347l += i7;
        this.f21346k -= i10;
    }
}
