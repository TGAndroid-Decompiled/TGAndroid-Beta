package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import g7.l0;
import h3.t0;
import j4.a1;
import m3.w;

public final class m extends a {
    public final int A;
    public final t0 B;
    public long C;
    public boolean D;

    public m(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, long j10, long j11, long j12, int i11, t0 t0Var2) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.A = i11;
        this.B = t0Var2;
    }

    @Override
    public final void a() {
        x0 x0Var = this.f15423r;
        g5.b bVar = this.f15399x;
        d5.a.j(bVar);
        for (a1 a1Var : (a1[]) bVar.f6390c) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.f12529z = true;
            }
        }
        w wVarU = bVar.u(this.A);
        wVarU.c(this.B);
        try {
            long jOpen = x0Var.open(this.f15418b.a(this.C));
            if (jOpen != -1) {
                jOpen += this.C;
            }
            m3.h hVar = new m3.h(this.f15423r, this.C, jOpen);
            for (int iB = 0; iB != -1; iB = wVarU.b(hVar, Integer.MAX_VALUE, true)) {
                this.C += (long) iB;
            }
            wVarU.e(this.h, 1, (int) this.C, 0, null);
            l0.a(x0Var);
            this.D = true;
        } catch (Throwable th) {
            l0.a(x0Var);
            throw th;
        }
    }

    @Override
    public final boolean c() {
        return this.D;
    }

    @Override
    public final void l() {
    }
}
