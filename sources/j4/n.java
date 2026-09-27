package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f12723l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12724a;
    public final e2.v f12725b;
    public final boolean[] f12726c = new boolean[4];
    public final l d;
    public final m0 e;
    public m f12727f;
    public long f12728g;
    public String h;
    public h0 f12729i;
    public boolean f12730j;
    public long f12731k;

    public n(c0 c0Var) {
        this.f12724a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12731k = -9223372036854775807L;
        this.e = new m0(178);
        this.f12725b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12726c);
        l lVar = this.d;
        lVar.f12715a = false;
        lVar.f12717c = 0;
        lVar.f12716b = 0;
        m mVar = this.f12727f;
        if (mVar != null) {
            mVar.f12719b = false;
            mVar.f12720c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f12728g = 0L;
        this.f12731k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12729i = Z1;
        this.f12727f = new m(Z1);
        this.f12724a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12727f);
        if (z10) {
            this.f12727f.b(0, this.f12728g, this.f12730j);
            m mVar = this.f12727f;
            mVar.f12719b = false;
            mVar.f12720c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12731k = j3;
    }
}
