package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;
import l4.b1;
import o3.w;
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
        b1[] b1VarArr;
        x0 x0Var = this.f17133r;
        g9.l lVar = this.f17109x;
        f5.a.j(lVar);
        for (b1 b1Var : (b1[]) lVar.f7169c) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.f14288z = true;
            }
        }
        w q6 = lVar.q(this.A);
        q6.b(this.B);
        try {
            long open = x0Var.open(this.f17128b.a(this.C));
            if (open != -1) {
                open += this.C;
            }
            o3.h hVar = new o3.h(this.f17133r, this.C, open);
            for (int i10 = 0; i10 != -1; i10 = q6.a(hVar, Integer.MAX_VALUE, true)) {
                this.C += i10;
            }
            q6.c(this.h, 1, (int) this.C, 0, null);
            m5.a(x0Var);
            this.D = true;
        } catch (Throwable th2) {
            m5.a(x0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.D;
    }

    @Override
    public final void q() {
    }
}
