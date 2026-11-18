package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20667l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20668a;
    public final h2.x f20669b;
    public final boolean[] f20670c = new boolean[4];
    public final l d;
    public final l0 f20671e;
    public m f20672f;
    public long f20673g;
    public String h;
    public i0 f20674i;
    public boolean f20675j;
    public long f20676k;

    public n(c0 c0Var) {
        this.f20668a = c0Var;
        ?? obj = new Object();
        obj.f20660e = new byte[128];
        this.d = obj;
        this.f20676k = -9223372036854775807L;
        this.f20671e = new l0(178);
        this.f20669b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20670c);
        l lVar = this.d;
        lVar.f20657a = false;
        lVar.f20659c = 0;
        lVar.f20658b = 0;
        m mVar = this.f20672f;
        if (mVar != null) {
            mVar.f20662b = false;
            mVar.f20663c = false;
            mVar.d = false;
            mVar.f20664e = -1;
        }
        l0 l0Var = this.f20671e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20673g = 0L;
        this.f20676k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20672f.getClass();
        if (z10) {
            this.f20672f.b(0, this.f20673g, this.f20675j);
            m mVar = this.f20672f;
            mVar.f20662b = false;
            mVar.f20663c = false;
            mVar.d = false;
            mVar.f20664e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20676k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20614e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20613c, 2);
        this.f20674i = d2;
        this.f20672f = new m(d2);
        this.f20668a.b(qVar, f0Var);
    }
}
