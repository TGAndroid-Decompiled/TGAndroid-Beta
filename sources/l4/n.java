package l4;

import e3.i0;
import k2.o0;
public final class n implements i {
    public static final float[] f17876l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f17877a;
    public final g2.y f17878b;
    public final boolean[] f17879c = new boolean[4];
    public final l d;
    public final o0 f17880e;
    public m f17881f;
    public long f17882g;
    public String h;
    public i0 f17883i;
    public boolean f17884j;
    public long f17885k;

    public n(c0 c0Var) {
        this.f17877a = c0Var;
        ?? obj = new Object();
        obj.f17869e = new byte[128];
        this.d = obj;
        this.f17885k = -9223372036854775807L;
        this.f17880e = new o0(178);
        this.f17878b = new g2.y();
    }

    @Override
    public final void a() {
        h2.o.b(this.f17879c);
        l lVar = this.d;
        lVar.f17866a = false;
        lVar.f17868c = 0;
        lVar.f17867b = 0;
        m mVar = this.f17881f;
        if (mVar != null) {
            mVar.f17871b = false;
            mVar.f17872c = false;
            mVar.d = false;
            mVar.f17873e = -1;
        }
        o0 o0Var = this.f17880e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f17882g = 0L;
        this.f17885k = -9223372036854775807L;
    }

    @Override
    public final void c(g2.y r20) {
        throw new UnsupportedOperationException("Method not decompiled: l4.n.c(g2.y):void");
    }

    @Override
    public final void d(boolean z10) {
        this.f17881f.getClass();
        if (z10) {
            this.f17881f.b(0, this.f17882g, this.f17884j);
            m mVar = this.f17881f;
            mVar.f17871b = false;
            mVar.f17872c = false;
            mVar.d = false;
            mVar.f17873e = -1;
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17885k = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f17823e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.f17822c, 2);
        this.f17883i = i02;
        this.f17881f = new m(i02);
        this.f17877a.b(qVar, f0Var);
    }
}
