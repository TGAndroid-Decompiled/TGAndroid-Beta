package m4;

import f3.j0;
import l2.o0;
public final class n implements i {
    public static final float[] f19709l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f19710a;
    public final h2.x f19711b;
    public final boolean[] f19712c = new boolean[4];
    public final l d;
    public final o0 f19713e;
    public m f19714f;
    public long f19715g;
    public String h;
    public j0 f19716i;
    public boolean f19717j;
    public long f19718k;

    public n(c0 c0Var) {
        this.f19710a = c0Var;
        ?? obj = new Object();
        obj.f19702e = new byte[128];
        this.d = obj;
        this.f19718k = -9223372036854775807L;
        this.f19713e = new o0(178);
        this.f19711b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19712c);
        l lVar = this.d;
        lVar.f19699a = false;
        lVar.f19701c = 0;
        lVar.f19700b = 0;
        m mVar = this.f19714f;
        if (mVar != null) {
            mVar.f19704b = false;
            mVar.f19705c = false;
            mVar.d = false;
            mVar.f19706e = -1;
        }
        o0 o0Var = this.f19713e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19715g = 0L;
        this.f19718k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19714f.getClass();
        if (z9) {
            this.f19714f.b(0, this.f19715g, this.f19717j);
            m mVar = this.f19714f;
            mVar.f19704b = false;
            mVar.f19705c = false;
            mVar.d = false;
            mVar.f19706e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19718k = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.f19671e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19670c, 2);
        this.f19716i = O1;
        this.f19714f = new m(O1);
        this.f19710a.b(qVar, g0Var);
    }
}
