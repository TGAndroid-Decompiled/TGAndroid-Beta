package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f13859l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13860a;
    public final e2.v f13861b;
    public final boolean[] f13862c = new boolean[4];
    public final l d;
    public final m0 f13863e;
    public m f13864f;
    public long f13865g;
    public String h;
    public h0 f13866i;
    public boolean f13867j;
    public long f13868k;

    public n(c0 c0Var) {
        this.f13860a = c0Var;
        ?? obj = new Object();
        obj.f13852e = new byte[128];
        this.d = obj;
        this.f13868k = -9223372036854775807L;
        this.f13863e = new m0(178);
        this.f13861b = new e2.v();
    }

    @Override
    public final void b(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13862c);
        l lVar = this.d;
        lVar.f13849a = false;
        lVar.f13851c = 0;
        lVar.f13850b = 0;
        m mVar = this.f13864f;
        if (mVar != null) {
            mVar.f13854b = false;
            mVar.f13855c = false;
            mVar.d = false;
            mVar.f13856e = -1;
        }
        m0 m0Var = this.f13863e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13865g = 0L;
        this.f13868k = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f13806e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13805c, 2);
        this.f13866i = f22;
        this.f13864f = new m(f22);
        this.f13860a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13864f);
        if (z10) {
            this.f13864f.b(0, this.f13865g, this.f13867j);
            m mVar = this.f13864f;
            mVar.f13854b = false;
            mVar.f13855c = false;
            mVar.d = false;
            mVar.f13856e = -1;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13868k = j3;
    }
}
