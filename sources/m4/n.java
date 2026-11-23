package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20664l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20665a;
    public final h2.x f20666b;
    public final boolean[] f20667c = new boolean[4];
    public final l d;
    public final l0 f20668e;
    public m f20669f;
    public long f20670g;
    public String h;
    public i0 f20671i;
    public boolean f20672j;
    public long f20673k;

    public n(c0 c0Var) {
        this.f20665a = c0Var;
        ?? obj = new Object();
        obj.f20657e = new byte[128];
        this.d = obj;
        this.f20673k = -9223372036854775807L;
        this.f20668e = new l0(178);
        this.f20666b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20667c);
        l lVar = this.d;
        lVar.f20654a = false;
        lVar.f20656c = 0;
        lVar.f20655b = 0;
        m mVar = this.f20669f;
        if (mVar != null) {
            mVar.f20659b = false;
            mVar.f20660c = false;
            mVar.d = false;
            mVar.f20661e = -1;
        }
        l0 l0Var = this.f20668e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20670g = 0L;
        this.f20673k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20669f.getClass();
        if (z10) {
            this.f20669f.b(0, this.f20670g, this.f20672j);
            m mVar = this.f20669f;
            mVar.f20659b = false;
            mVar.f20660c = false;
            mVar.d = false;
            mVar.f20661e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20673k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20611e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20610c, 2);
        this.f20671i = d2;
        this.f20669f = new m(d2);
        this.f20665a.b(qVar, f0Var);
    }
}
