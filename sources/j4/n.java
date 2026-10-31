package j4;

import c3.k0;
import i2.p0;
public final class n implements i {
    public static final float[] f9524l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f9525a;
    public final e2.x f9526b;
    public final boolean[] f9527c = new boolean[4];
    public final l d;
    public final p0 e;
    public m f9528f;
    public long f9529g;
    public String h;
    public k0 f9530i;
    public boolean f9531j;
    public long f9532k;

    public n(d0 d0Var) {
        this.f9525a = d0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f9532k = -9223372036854775807L;
        this.e = new p0(178);
        this.f9526b = new e2.x();
    }

    @Override
    public final void c(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.c(e2.x):void");
    }

    @Override
    public final void e() {
        f2.q.b(this.f9527c);
        l lVar = this.d;
        lVar.f9516a = false;
        lVar.f9518c = 0;
        lVar.f9517b = 0;
        m mVar = this.f9528f;
        if (mVar != null) {
            mVar.f9520b = false;
            mVar.f9521c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f9529g = 0L;
        this.f9532k = -9223372036854775807L;
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.f9491c, 2);
        this.f9530i = I1;
        this.f9528f = new m(I1);
        this.f9525a.b(qVar, g0Var);
    }

    @Override
    public final void g(boolean z10) {
        this.f9528f.getClass();
        if (z10) {
            this.f9528f.b(0, this.f9529g, this.f9531j);
            m mVar = this.f9528f;
            mVar.f9520b = false;
            mVar.f9521c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void h(int i10, long j10) {
        this.f9532k = j10;
    }
}
