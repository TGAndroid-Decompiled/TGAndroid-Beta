package c4;

import c2.a1;
import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import r3.m;
import r3.v;
public final class a implements b {
    public static final int[] f2229m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f2230n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m f2231a;
    public final v f2232b;
    public final a1 f2233c;
    public final int d;
    public final byte[] f2234e;
    public final w f2235f;
    public final int f2236g;
    public final n0 h;
    public int f2237i;
    public long f2238j;
    public int f2239k;
    public long f2240l;

    public a(m mVar, v vVar, a1 a1Var) {
        this.f2231a = mVar;
        this.f2232b = vVar;
        this.f2233c = a1Var;
        int i10 = a1Var.f2059b;
        int max = Math.max(1, i10 / 10);
        this.f2236g = max;
        w wVar = new w((byte[]) a1Var.f2061e);
        wVar.n();
        int n10 = wVar.n();
        this.d = n10;
        int i11 = a1Var.f2058a;
        int i12 = a1Var.f2060c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (a1Var.d * i11)) + 1;
        if (n10 == i13) {
            int f10 = d0.f(max, n10);
            this.f2234e = new byte[f10 * i12];
            this.f2235f = new w(n10 * 2 * i11 * f10);
            int i14 = ((i12 * i10) * 8) / n10;
            m0 m0Var = new m0();
            m0Var.f9265o = "audio/raw";
            m0Var.f9257f = i14;
            m0Var.f9258g = i14;
            m0Var.f9266p = max * 2 * i11;
            m0Var.B = i11;
            m0Var.C = i10;
            m0Var.D = 2;
            this.h = new n0(m0Var);
            return;
        }
        throw r1.a("Expected frames per block: " + i13 + "; got: " + n10, null);
    }

    @Override
    public final void a(long j10) {
        this.f2237i = 0;
        this.f2238j = j10;
        this.f2239k = 0;
        this.f2240l = 0L;
    }

    @Override
    public final boolean b(r3.l r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: c4.a.b(r3.l, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        this.f2231a.m2(new f(this.f2233c, this.d, i10, j10));
        this.f2232b.b(this.h);
    }

    public final void d(int i10) {
        long j10 = this.f2238j;
        long j11 = this.f2240l;
        a1 a1Var = this.f2233c;
        long N = j10 + d0.N(j11, 1000000L, a1Var.f2059b);
        int i11 = i10 * 2 * a1Var.f2058a;
        this.f2232b.c(N, 1, i11, this.f2239k - i11, null);
        this.f2240l += i10;
        this.f2239k -= i11;
    }
}
