package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;
import l4.b1;
public final class i extends a {
    public final int A;
    public final long B;
    public final d C;
    public long D;
    public volatile boolean E;
    public boolean F;

    public i(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, d dVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12, j13, j14);
        this.A = i11;
        this.B = j15;
        this.C = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        b1[] b1VarArr;
        long j10;
        if (this.D == 0) {
            g9.l lVar = this.f17109x;
            f5.a.j(lVar);
            long j11 = this.B;
            for (b1 b1Var : (b1[]) lVar.f7169c) {
                if (b1Var.F != j11) {
                    b1Var.F = j11;
                    b1Var.f14288z = true;
                }
            }
            d dVar = this.C;
            long j12 = this.v;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.B;
            }
            long j14 = this.f17108w;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.B;
            }
            dVar.a(lVar, j10, j13);
        }
        try {
            q a2 = this.f17128b.a(this.D);
            x0 x0Var = this.f17133r;
            o3.h hVar = new o3.h(x0Var, a2.f3602e, x0Var.open(a2));
            while (!this.E) {
                int d = this.C.f17120a.d(hVar, d.f17119s);
                if (d != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                if (d == 0) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.D = hVar.d - this.f17128b.f3602e;
            m5.a(this.f17133r);
            this.F = !this.E;
        } catch (Throwable th2) {
            m5.a(this.f17133r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f17152s + this.A;
    }

    @Override
    public final boolean c() {
        return this.F;
    }

    @Override
    public final void q() {
        this.E = true;
    }
}
