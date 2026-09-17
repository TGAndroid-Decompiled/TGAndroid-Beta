package j4;

import c3.h0;
import i2.l0;
public final class n implements i {
    public static final float[] f13374l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13375a;
    public final e2.v f13376b;
    public final boolean[] f13377c = new boolean[4];
    public final l d;
    public final l0 f13378e;
    public m f13379f;
    public long f13380g;
    public String h;
    public h0 f13381i;
    public boolean f13382j;
    public long f13383k;

    public n(c0 c0Var) {
        this.f13375a = c0Var;
        ?? obj = new Object();
        obj.f13367e = new byte[128];
        this.d = obj;
        this.f13383k = -9223372036854775807L;
        this.f13378e = new l0(178);
        this.f13376b = new e2.v();
    }

    @Override
    public final void b(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13377c);
        l lVar = this.d;
        lVar.f13364a = false;
        lVar.f13366c = 0;
        lVar.f13365b = 0;
        m mVar = this.f13379f;
        if (mVar != null) {
            mVar.f13369b = false;
            mVar.f13370c = false;
            mVar.d = false;
            mVar.f13371e = -1;
        }
        l0 l0Var = this.f13378e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f13380g = 0L;
        this.f13383k = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.f13321e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13381i = R1;
        this.f13379f = new m(R1);
        this.f13375a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13379f);
        if (z10) {
            this.f13379f.b(0, this.f13380g, this.f13382j);
            m mVar = this.f13379f;
            mVar.f13369b = false;
            mVar.f13370c = false;
            mVar.d = false;
            mVar.f13371e = -1;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13383k = j3;
    }
}
