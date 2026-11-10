package m4;

import f3.j0;
import l2.o0;
public final class n implements i {
    public static final float[] f19717l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f19718a;
    public final h2.x f19719b;
    public final boolean[] f19720c = new boolean[4];
    public final l d;
    public final o0 f19721e;
    public m f19722f;
    public long f19723g;
    public String h;
    public j0 f19724i;
    public boolean f19725j;
    public long f19726k;

    public n(c0 c0Var) {
        this.f19718a = c0Var;
        ?? obj = new Object();
        obj.f19710e = new byte[128];
        this.d = obj;
        this.f19726k = -9223372036854775807L;
        this.f19721e = new o0(178);
        this.f19719b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f19720c);
        l lVar = this.d;
        lVar.f19707a = false;
        lVar.f19709c = 0;
        lVar.f19708b = 0;
        m mVar = this.f19722f;
        if (mVar != null) {
            mVar.f19712b = false;
            mVar.f19713c = false;
            mVar.d = false;
            mVar.f19714e = -1;
        }
        o0 o0Var = this.f19721e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f19723g = 0L;
        this.f19726k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z9) {
        this.f19722f.getClass();
        if (z9) {
            this.f19722f.b(0, this.f19723g, this.f19725j);
            m mVar = this.f19722f;
            mVar.f19712b = false;
            mVar.f19713c = false;
            mVar.d = false;
            mVar.f19714e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19726k = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.f19679e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19678c, 2);
        this.f19724i = O1;
        this.f19722f = new m(O1);
        this.f19718a.b(qVar, g0Var);
    }
}
