package j4;

import c3.i0;
import i2.o0;
public final class n implements i {
    public static final float[] f12690l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12691a;
    public final e2.x f12692b;
    public final boolean[] f12693c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f12694f;
    public long f12695g;
    public String h;
    public i0 f12696i;
    public boolean f12697j;
    public long f12698k;

    public n(c0 c0Var) {
        this.f12691a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12698k = -9223372036854775807L;
        this.e = new o0(178);
        this.f12692b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.p.b(this.f12693c);
        l lVar = this.d;
        lVar.f12682a = false;
        lVar.f12684c = 0;
        lVar.f12683b = 0;
        m mVar = this.f12694f;
        if (mVar != null) {
            mVar.f12686b = false;
            mVar.f12687c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f12695g = 0L;
        this.f12698k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        i0 a02 = qVar.a0(f0Var.f12643c, 2);
        this.f12696i = a02;
        this.f12694f = new m(a02);
        this.f12691a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f12694f.getClass();
        if (z10) {
            this.f12694f.b(0, this.f12695g, this.f12697j);
            m mVar = this.f12694f;
            mVar.f12686b = false;
            mVar.f12687c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f12698k = j10;
    }
}
