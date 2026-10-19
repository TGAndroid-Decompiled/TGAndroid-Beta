package j4;

import c3.j0;
import i2.o0;
public final class n implements i {
    public static final float[] f14104l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f14105a;
    public final e2.x f14106b;
    public final boolean[] f14107c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f14108f;
    public long f14109g;
    public String h;
    public j0 f14110i;
    public boolean f14111j;
    public long f14112k;

    public n(c0 c0Var) {
        this.f14105a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f14112k = -9223372036854775807L;
        this.e = new o0(178);
        this.f14106b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14107c);
        l lVar = this.d;
        lVar.f14096a = false;
        lVar.f14098c = 0;
        lVar.f14097b = 0;
        m mVar = this.f14108f;
        if (mVar != null) {
            mVar.f14100b = false;
            mVar.f14101c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f14109g = 0L;
        this.f14112k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14057c, 2);
        this.f14110i = j02;
        this.f14108f = new m(j02);
        this.f14105a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14108f.getClass();
        if (z10) {
            this.f14108f.b(0, this.f14109g, this.f14111j);
            m mVar = this.f14108f;
            mVar.f14100b = false;
            mVar.f14101c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14112k = j10;
    }
}
