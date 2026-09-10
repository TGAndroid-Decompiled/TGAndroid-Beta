package j4;

import i2.k0;
public final class n implements i {
    public static final float[] f11627l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f11628a;
    public final e2.v f11629b;
    public final boolean[] f11630c = new boolean[4];
    public final l d;
    public final k0 e;
    public m f11631f;
    public long f11632g;
    public String h;
    public c3.h0 f11633i;
    public boolean f11634j;
    public long f11635k;

    public n(d0 d0Var) {
        this.f11628a = d0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f11635k = -9223372036854775807L;
        this.e = new k0(178);
        this.f11629b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void b() {
        f2.o.a(this.f11630c);
        l lVar = this.d;
        lVar.f11619a = false;
        lVar.f11621c = 0;
        lVar.f11620b = 0;
        m mVar = this.f11631f;
        if (mVar != null) {
            mVar.f11623b = false;
            mVar.f11624c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        k0 k0Var = this.e;
        if (k0Var != null) {
            k0Var.g();
        }
        this.f11632g = 0L;
        this.f11635k = -9223372036854775807L;
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.h = g0Var.e;
        g0Var.b();
        c3.h0 I = qVar.I(g0Var.d, 2);
        this.f11633i = I;
        this.f11631f = new m(I);
        this.f11628a.b(qVar, g0Var);
    }

    @Override
    public final void d(boolean z10) {
        e2.d.h(this.f11631f);
        if (z10) {
            this.f11631f.b(0, this.f11632g, this.f11634j);
            m mVar = this.f11631f;
            mVar.f11623b = false;
            mVar.f11624c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11635k = j3;
    }
}
