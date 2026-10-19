package j4;

import c3.j0;
import i2.o0;
public final class n implements i {
    public static final float[] f14106l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f14107a;
    public final e2.x f14108b;
    public final boolean[] f14109c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f14110f;
    public long f14111g;
    public String h;
    public j0 f14112i;
    public boolean f14113j;
    public long f14114k;

    public n(c0 c0Var) {
        this.f14107a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f14114k = -9223372036854775807L;
        this.e = new o0(178);
        this.f14108b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14109c);
        l lVar = this.d;
        lVar.f14098a = false;
        lVar.f14100c = 0;
        lVar.f14099b = 0;
        m mVar = this.f14110f;
        if (mVar != null) {
            mVar.f14102b = false;
            mVar.f14103c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f14111g = 0L;
        this.f14114k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14059c, 2);
        this.f14112i = j02;
        this.f14110f = new m(j02);
        this.f14107a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14110f.getClass();
        if (z10) {
            this.f14110f.b(0, this.f14111g, this.f14113j);
            m mVar = this.f14110f;
            mVar.f14102b = false;
            mVar.f14103c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14114k = j10;
    }
}
