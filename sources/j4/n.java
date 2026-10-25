package j4;

import c3.j0;
import i2.p0;
public final class n implements i {
    public static final float[] f15362l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f15363a;
    public final e2.x f15364b;
    public final boolean[] f15365c = new boolean[4];
    public final l d;
    public final p0 e;
    public m f15366f;
    public long f15367g;
    public String h;
    public j0 f15368i;
    public boolean f15369j;
    public long f15370k;

    public n(c0 c0Var) {
        this.f15363a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f15370k = -9223372036854775807L;
        this.e = new p0(178);
        this.f15364b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f15365c);
        l lVar = this.d;
        lVar.f15354a = false;
        lVar.f15356c = 0;
        lVar.f15355b = 0;
        m mVar = this.f15366f;
        if (mVar != null) {
            mVar.f15358b = false;
            mVar.f15359c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
        }
        this.f15367g = 0L;
        this.f15370k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        j0 F1 = qVar.F1(f0Var.f15315c, 2);
        this.f15368i = F1;
        this.f15366f = new m(F1);
        this.f15363a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f15366f.getClass();
        if (z10) {
            this.f15366f.b(0, this.f15367g, this.f15369j);
            m mVar = this.f15366f;
            mVar.f15358b = false;
            mVar.f15359c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f15370k = j10;
    }
}
