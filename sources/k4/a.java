package k4;

import b2.r;
import b2.r0;
import b2.s;
import b2.s0;
import c3.h0;
import c3.q;
import e2.d0;
import e2.v;
import java.math.RoundingMode;
public final class a implements b {
    public static final int[] f13418m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f13419n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final q f13420a;
    public final h0 f13421b;
    public final e2.q f13422c;
    public final int d;
    public final byte[] e;
    public final v f13423f;
    public final int f13424g;
    public final s h;
    public int f13425i;
    public long f13426j;
    public int f13427k;
    public long f13428l;

    public a(q qVar, h0 h0Var, e2.q qVar2) {
        this.f13420a = qVar;
        this.f13421b = h0Var;
        this.f13422c = qVar2;
        int i10 = qVar2.f7922b;
        int max = Math.max(1, i10 / 10);
        this.f13424g = max;
        v vVar = new v((byte[]) qVar2.e);
        vVar.q();
        int q6 = vVar.q();
        this.d = q6;
        int i11 = qVar2.f7921a;
        int i12 = qVar2.f7923c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (qVar2.d * i11)) + 1;
        if (q6 == i13) {
            int f7 = d0.f(max, q6);
            this.e = new byte[f7 * i12];
            this.f13423f = new v(q6 * 2 * i11 * f7);
            int i14 = ((i12 * i10) * 8) / q6;
            r rVar = new r();
            rVar.f3252q = r0.n("audio/raw");
            rVar.h = i14;
            rVar.f3244i = i14;
            rVar.f3253r = max * 2 * i11;
            rVar.I = i11;
            rVar.J = i10;
            rVar.K = 2;
            this.h = new s(rVar);
            return;
        }
        throw s0.a(null, "Expected frames per block: " + i13 + "; got: " + q6);
    }

    @Override
    public final void a(long j3) {
        this.f13425i = 0;
        this.f13426j = j3;
        this.f13427k = 0;
        this.f13428l = 0L;
    }

    @Override
    public final boolean b(c3.p r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: k4.a.b(c3.p, long):boolean");
    }

    @Override
    public final void c(int i10, long j3) {
        this.f13420a.X1(new f(this.f13422c, this.d, i10, j3));
        this.f13421b.b(this.h);
    }

    public final void d(int i10) {
        long j3 = this.f13426j;
        long j10 = this.f13428l;
        e2.q qVar = this.f13422c;
        long j11 = qVar.f7922b;
        String str = d0.f7887a;
        long Y = j3 + d0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
        int i11 = i10 * 2 * qVar.f7921a;
        this.f13421b.c(Y, 1, i11, this.f13427k - i11, null);
        this.f13428l += i10;
        this.f13427k -= i11;
    }
}
