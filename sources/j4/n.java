package j4;

import c3.h0;
import i2.l0;
public final class n implements i {
    public static final float[] f12728l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12729a;
    public final e2.v f12730b;
    public final boolean[] f12731c = new boolean[4];
    public final l d;
    public final l0 e;
    public m f12732f;
    public long f12733g;
    public String h;
    public h0 f12734i;
    public boolean f12735j;
    public long f12736k;

    public n(c0 c0Var) {
        this.f12729a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12736k = -9223372036854775807L;
        this.e = new l0(178);
        this.f12730b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12731c);
        l lVar = this.d;
        lVar.f12720a = false;
        lVar.f12722c = 0;
        lVar.f12721b = 0;
        m mVar = this.f12732f;
        if (mVar != null) {
            mVar.f12724b = false;
            mVar.f12725c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        l0 l0Var = this.e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f12733g = 0L;
        this.f12736k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12734i = Z1;
        this.f12732f = new m(Z1);
        this.f12729a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12732f);
        if (z10) {
            this.f12732f.b(0, this.f12733g, this.f12735j);
            m mVar = this.f12732f;
            mVar.f12724b = false;
            mVar.f12725c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12736k = j3;
    }
}
