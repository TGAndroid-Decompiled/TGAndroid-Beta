package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import g7.l0;
import h3.t0;

public final class j extends e {

    public final d f15439s;
    public g5.b v;

    public long f15440w;

    public volatile boolean f15441x;

    public j(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, d dVar) {
        super(mVar, qVar, 2, t0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f15439s = dVar;
    }

    @Override
    public final void a() {
        if (this.f15440w == 0) {
            this.f15439s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q qVarA = this.f15418b.a(this.f15440w);
            x0 x0Var = this.f15423r;
            m3.h hVar = new m3.h(x0Var, qVarA.f3025e, x0Var.open(qVarA));
            while (!this.f15441x) {
                try {
                    int iB = this.f15439s.f15410a.b(hVar, d.f15409s);
                    boolean z10 = false;
                    d5.a.i(iB != 1);
                    if (iB == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f15440w = hVar.d - this.f15418b.f3025e;
                    throw th;
                }
            }
            this.f15440w = hVar.d - this.f15418b.f3025e;
            l0.a(this.f15423r);
        } catch (Throwable th2) {
            l0.a(this.f15423r);
            throw th2;
        }
    }

    @Override
    public final void l() {
        this.f15441x = true;
    }
}
