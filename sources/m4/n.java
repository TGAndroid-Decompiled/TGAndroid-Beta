package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20670l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20671a;
    public final h2.x f20672b;
    public final boolean[] f20673c = new boolean[4];
    public final l d;
    public final l0 f20674e;
    public m f20675f;
    public long f20676g;
    public String h;
    public i0 f20677i;
    public boolean f20678j;
    public long f20679k;

    public n(c0 c0Var) {
        this.f20671a = c0Var;
        ?? obj = new Object();
        obj.f20663e = new byte[128];
        this.d = obj;
        this.f20679k = -9223372036854775807L;
        this.f20674e = new l0(178);
        this.f20672b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20673c);
        l lVar = this.d;
        lVar.f20660a = false;
        lVar.f20662c = 0;
        lVar.f20661b = 0;
        m mVar = this.f20675f;
        if (mVar != null) {
            mVar.f20665b = false;
            mVar.f20666c = false;
            mVar.d = false;
            mVar.f20667e = -1;
        }
        l0 l0Var = this.f20674e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20676g = 0L;
        this.f20679k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20675f.getClass();
        if (z10) {
            this.f20675f.b(0, this.f20676g, this.f20678j);
            m mVar = this.f20675f;
            mVar.f20665b = false;
            mVar.f20666c = false;
            mVar.d = false;
            mVar.f20667e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20679k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20617e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20616c, 2);
        this.f20677i = d2;
        this.f20675f = new m(d2);
        this.f20671a.b(qVar, f0Var);
    }
}
