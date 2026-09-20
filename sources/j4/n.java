package j4;

import c3.h0;
import i2.l0;
public final class n implements i {
    public static final float[] f12732l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12733a;
    public final e2.v f12734b;
    public final boolean[] f12735c = new boolean[4];
    public final l d;
    public final l0 e;
    public m f12736f;
    public long f12737g;
    public String h;
    public h0 f12738i;
    public boolean f12739j;
    public long f12740k;

    public n(c0 c0Var) {
        this.f12733a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12740k = -9223372036854775807L;
        this.e = new l0(178);
        this.f12734b = new e2.v();
    }

    @Override
    public final void b(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.o.a(this.f12735c);
        l lVar = this.d;
        lVar.f12724a = false;
        lVar.f12726c = 0;
        lVar.f12725b = 0;
        m mVar = this.f12736f;
        if (mVar != null) {
            mVar.f12728b = false;
            mVar.f12729c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        l0 l0Var = this.e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f12737g = 0L;
        this.f12740k = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12738i = Z1;
        this.f12736f = new m(Z1);
        this.f12733a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f12736f);
        if (z10) {
            this.f12736f.b(0, this.f12737g, this.f12739j);
            m mVar = this.f12736f;
            mVar.f12728b = false;
            mVar.f12729c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f12740k = j3;
    }
}
