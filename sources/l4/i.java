package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import g7.l0;
import h3.t0;
import j4.a1;

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
        if (this.D == 0) {
            g5.b bVar = this.f15399x;
            d5.a.j(bVar);
            long j10 = this.B;
            for (a1 a1Var : (a1[]) bVar.f6390c) {
                if (a1Var.F != j10) {
                    a1Var.F = j10;
                    a1Var.f12529z = true;
                }
            }
            d dVar = this.C;
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.B;
            long j13 = this.f15398w;
            dVar.a(bVar, j12, j13 != -9223372036854775807L ? j13 - this.B : -9223372036854775807L);
        }
        try {
            q qVarA = this.f15418b.a(this.D);
            x0 x0Var = this.f15423r;
            m3.h hVar = new m3.h(x0Var, qVarA.f3025e, x0Var.open(qVarA));
            while (!this.E) {
                try {
                    int iB = this.C.f15410a.b(hVar, d.f15409s);
                    d5.a.i(iB != 1);
                    if (!(iB == 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    this.D = hVar.d - this.f15418b.f3025e;
                    throw th;
                }
            }
            this.D = hVar.d - this.f15418b.f3025e;
            l0.a(this.f15423r);
            this.F = !this.E;
        } catch (Throwable th2) {
            l0.a(this.f15423r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f15442s + ((long) this.A);
    }

    @Override
    public final boolean c() {
        return this.F;
    }

    @Override
    public final void l() {
        this.E = true;
    }
}
