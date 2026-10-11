package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f13861l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13862a;
    public final e2.v f13863b;
    public final boolean[] f13864c = new boolean[4];
    public final l d;
    public final m0 f13865e;
    public m f13866f;
    public long f13867g;
    public String h;
    public h0 f13868i;
    public boolean f13869j;
    public long f13870k;

    public n(c0 c0Var) {
        this.f13862a = c0Var;
        ?? obj = new Object();
        obj.f13854e = new byte[128];
        this.d = obj;
        this.f13870k = -9223372036854775807L;
        this.f13865e = new m0(178);
        this.f13863b = new e2.v();
    }

    @Override
    public final void b(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13864c);
        l lVar = this.d;
        lVar.f13851a = false;
        lVar.f13853c = 0;
        lVar.f13852b = 0;
        m mVar = this.f13866f;
        if (mVar != null) {
            mVar.f13856b = false;
            mVar.f13857c = false;
            mVar.d = false;
            mVar.f13858e = -1;
        }
        m0 m0Var = this.f13865e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13867g = 0L;
        this.f13870k = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f13808e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13807c, 2);
        this.f13868i = f22;
        this.f13866f = new m(f22);
        this.f13862a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13866f);
        if (z10) {
            this.f13866f.b(0, this.f13867g, this.f13869j);
            m mVar = this.f13866f;
            mVar.f13856b = false;
            mVar.f13857c = false;
            mVar.d = false;
            mVar.f13858e = -1;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13870k = j3;
    }
}
