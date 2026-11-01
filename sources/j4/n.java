package j4;

import c3.k0;
import i2.p0;
public final class n implements i {
    public static final float[] f9525l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f9526a;
    public final e2.x f9527b;
    public final boolean[] f9528c = new boolean[4];
    public final l d;
    public final p0 e;
    public m f9529f;
    public long f9530g;
    public String h;
    public k0 f9531i;
    public boolean f9532j;
    public long f9533k;

    public n(d0 d0Var) {
        this.f9526a = d0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f9533k = -9223372036854775807L;
        this.e = new p0(178);
        this.f9527b = new e2.x();
    }

    @Override
    public final void c(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.c(e2.x):void");
    }

    @Override
    public final void e() {
        f2.q.b(this.f9528c);
        l lVar = this.d;
        lVar.f9517a = false;
        lVar.f9519c = 0;
        lVar.f9518b = 0;
        m mVar = this.f9529f;
        if (mVar != null) {
            mVar.f9521b = false;
            mVar.f9522c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f9530g = 0L;
        this.f9533k = -9223372036854775807L;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9492c, 2);
        this.f9531i = I1;
        this.f9529f = new m(I1);
        this.f9526a.b(qVar, g0Var);
    }

    @Override
    public final void g(boolean z10) {
        this.f9529f.getClass();
        if (z10) {
            this.f9529f.b(0, this.f9530g, this.f9532j);
            m mVar = this.f9529f;
            mVar.f9521b = false;
            mVar.f9522c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9533k = j10;
    }
}
