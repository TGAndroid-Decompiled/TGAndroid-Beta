package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f13824l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13825a;
    public final e2.v f13826b;
    public final boolean[] f13827c = new boolean[4];
    public final l d;
    public final m0 f13828e;
    public m f13829f;
    public long f13830g;
    public String h;
    public h0 f13831i;
    public boolean f13832j;
    public long f13833k;

    public n(c0 c0Var) {
        this.f13825a = c0Var;
        ?? obj = new Object();
        obj.f13817e = new byte[128];
        this.d = obj;
        this.f13833k = -9223372036854775807L;
        this.f13828e = new m0(178);
        this.f13826b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f13827c);
        l lVar = this.d;
        lVar.f13814a = false;
        lVar.f13816c = 0;
        lVar.f13815b = 0;
        m mVar = this.f13829f;
        if (mVar != null) {
            mVar.f13819b = false;
            mVar.f13820c = false;
            mVar.d = false;
            mVar.f13821e = -1;
        }
        m0 m0Var = this.f13828e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13830g = 0L;
        this.f13833k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.f13771e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f13831i = Z1;
        this.f13829f = new m(Z1);
        this.f13825a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13829f);
        if (z10) {
            this.f13829f.b(0, this.f13830g, this.f13832j);
            m mVar = this.f13829f;
            mVar.f13819b = false;
            mVar.f13820c = false;
            mVar.d = false;
            mVar.f13821e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13833k = j3;
    }
}
