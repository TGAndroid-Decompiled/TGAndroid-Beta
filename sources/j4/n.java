package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f13862l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13863a;
    public final e2.v f13864b;
    public final boolean[] f13865c = new boolean[4];
    public final l d;
    public final m0 f13866e;
    public m f13867f;
    public long f13868g;
    public String h;
    public h0 f13869i;
    public boolean f13870j;
    public long f13871k;

    public n(c0 c0Var) {
        this.f13863a = c0Var;
        ?? obj = new Object();
        obj.f13855e = new byte[128];
        this.d = obj;
        this.f13871k = -9223372036854775807L;
        this.f13866e = new m0(178);
        this.f13864b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.p.a(this.f13865c);
        l lVar = this.d;
        lVar.f13852a = false;
        lVar.f13854c = 0;
        lVar.f13853b = 0;
        m mVar = this.f13867f;
        if (mVar != null) {
            mVar.f13857b = false;
            mVar.f13858c = false;
            mVar.d = false;
            mVar.f13859e = -1;
        }
        m0 m0Var = this.f13866e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f13868g = 0L;
        this.f13871k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f13809e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13808c, 2);
        this.f13869i = f22;
        this.f13867f = new m(f22);
        this.f13863a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13867f);
        if (z10) {
            this.f13867f.b(0, this.f13868g, this.f13870j);
            m mVar = this.f13867f;
            mVar.f13857b = false;
            mVar.f13858c = false;
            mVar.d = false;
            mVar.f13859e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13871k = j3;
    }
}
