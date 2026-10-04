package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f13825l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13826a;
    public final e2.v f13827b;
    public final boolean[] f13828c = new boolean[4];
    public final l d;
    public final m0 f13829e;
    public m f13830f;
    public long f13831g;
    public String h;
    public h0 f13832i;
    public boolean f13833j;
    public long f13834k;

    public n(c0 c0Var) {
        this.f13826a = c0Var;
        ?? obj = new Object();
        obj.f13818e = new byte[128];
        this.d = obj;
        this.f13834k = -9223372036854775807L;
        this.f13829e = new m0(178);
        this.f13827b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f13828c);
        l lVar = this.d;
        lVar.f13815a = false;
        lVar.f13817c = 0;
        lVar.f13816b = 0;
        m mVar = this.f13830f;
        if (mVar != null) {
            mVar.f13820b = false;
            mVar.f13821c = false;
            mVar.d = false;
            mVar.f13822e = -1;
        }
        m0 m0Var = this.f13829e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13831g = 0L;
        this.f13834k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.f13772e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f13832i = Z1;
        this.f13830f = new m(Z1);
        this.f13826a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13830f);
        if (z10) {
            this.f13830f.b(0, this.f13831g, this.f13833j);
            m mVar = this.f13830f;
            mVar.f13820b = false;
            mVar.f13821c = false;
            mVar.d = false;
            mVar.f13822e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13834k = j3;
    }
}
