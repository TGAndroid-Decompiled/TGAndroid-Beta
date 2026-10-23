package j4;

import c3.l0;
import i2.n0;
public final class n implements i {
    public static final float[] f14149l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f14150a;
    public final e2.x f14151b;
    public final boolean[] f14152c = new boolean[4];
    public final l d;
    public final n0 e;
    public m f14153f;
    public long f14154g;
    public String h;
    public l0 f14155i;
    public boolean f14156j;
    public long f14157k;

    public n(c0 c0Var) {
        this.f14150a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f14157k = -9223372036854775807L;
        this.e = new n0(178);
        this.f14151b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14152c);
        l lVar = this.d;
        lVar.f14141a = false;
        lVar.f14143c = 0;
        lVar.f14142b = 0;
        m mVar = this.f14153f;
        if (mVar != null) {
            mVar.f14145b = false;
            mVar.f14146c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        n0 n0Var = this.e;
        if (n0Var != null) {
            n0Var.g();
        }
        this.f14154g = 0L;
        this.f14157k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        l0 j02 = sVar.j0(f0Var.f14102c, 2);
        this.f14155i = j02;
        this.f14153f = new m(j02);
        this.f14150a.b(sVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14153f.getClass();
        if (z10) {
            this.f14153f.b(0, this.f14154g, this.f14156j);
            m mVar = this.f14153f;
            mVar.f14145b = false;
            mVar.f14146c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14157k = j10;
    }
}
