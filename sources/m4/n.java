package m4;

import f3.j0;
import l2.o0;
public final class n implements i {
    public static final float[] f19712l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f19713a;
    public final h2.x f19714b;
    public final boolean[] f19715c = new boolean[4];
    public final l d;
    public final o0 f19716e;
    public m f19717f;
    public long f19718g;
    public String h;
    public j0 f19719i;
    public boolean f19720j;
    public long f19721k;

    public n(c0 c0Var) {
        this.f19713a = c0Var;
        ?? obj = new Object();
        obj.f19705e = new byte[128];
        this.d = obj;
        this.f19721k = -9223372036854775807L;
        this.f19716e = new o0(178);
        this.f19714b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19715c);
        l lVar = this.d;
        lVar.f19702a = false;
        lVar.f19704c = 0;
        lVar.f19703b = 0;
        m mVar = this.f19717f;
        if (mVar != null) {
            mVar.f19707b = false;
            mVar.f19708c = false;
            mVar.d = false;
            mVar.f19709e = -1;
        }
        o0 o0Var = this.f19716e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19718g = 0L;
        this.f19721k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19717f.getClass();
        if (z9) {
            this.f19717f.b(0, this.f19718g, this.f19720j);
            m mVar = this.f19717f;
            mVar.f19707b = false;
            mVar.f19708c = false;
            mVar.d = false;
            mVar.f19709e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19721k = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.f19674e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19673c, 2);
        this.f19719i = O1;
        this.f19717f = new m(O1);
        this.f19713a.b(qVar, g0Var);
    }
}
