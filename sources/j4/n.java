package j4;

import c3.i0;
import i2.o0;
public final class n implements i {
    public static final float[] f12694l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12695a;
    public final e2.x f12696b;
    public final boolean[] f12697c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f12698f;
    public long f12699g;
    public String h;
    public i0 f12700i;
    public boolean f12701j;
    public long f12702k;

    public n(c0 c0Var) {
        this.f12695a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12702k = -9223372036854775807L;
        this.e = new o0(178);
        this.f12696b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.p.b(this.f12697c);
        l lVar = this.d;
        lVar.f12686a = false;
        lVar.f12688c = 0;
        lVar.f12687b = 0;
        m mVar = this.f12698f;
        if (mVar != null) {
            mVar.f12690b = false;
            mVar.f12691c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f12699g = 0L;
        this.f12702k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        i0 W = qVar.W(f0Var.f12647c, 2);
        this.f12700i = W;
        this.f12698f = new m(W);
        this.f12695a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f12698f.getClass();
        if (z10) {
            this.f12698f.b(0, this.f12699g, this.f12701j);
            m mVar = this.f12698f;
            mVar.f12690b = false;
            mVar.f12691c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12702k = j10;
    }
}
