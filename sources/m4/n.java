package m4;

import f3.j0;
import l2.m0;
public final class n implements i {
    public static final float[] f20760l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20761a;
    public final h2.x f20762b;
    public final boolean[] f20763c = new boolean[4];
    public final l d;
    public final m0 f20764e;
    public m f20765f;
    public long f20766g;
    public String h;
    public j0 f20767i;
    public boolean f20768j;
    public long f20769k;

    public n(c0 c0Var) {
        this.f20761a = c0Var;
        ?? obj = new Object();
        obj.f20753e = new byte[128];
        this.d = obj;
        this.f20769k = -9223372036854775807L;
        this.f20764e = new m0(178);
        this.f20762b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20763c);
        l lVar = this.d;
        lVar.f20750a = false;
        lVar.f20752c = 0;
        lVar.f20751b = 0;
        m mVar = this.f20765f;
        if (mVar != null) {
            mVar.f20755b = false;
            mVar.f20756c = false;
            mVar.d = false;
            mVar.f20757e = -1;
        }
        m0 m0Var = this.f20764e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f20766g = 0L;
        this.f20769k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20765f.getClass();
        if (z10) {
            this.f20765f.b(0, this.f20766g, this.f20768j);
            m mVar = this.f20765f;
            mVar.f20755b = false;
            mVar.f20756c = false;
            mVar.d = false;
            mVar.f20757e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20769k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20707e;
        f0Var.c();
        j0 d2 = qVar.d2(f0Var.f20706c, 2);
        this.f20767i = d2;
        this.f20765f = new m(d2);
        this.f20761a.b(qVar, f0Var);
    }
}
