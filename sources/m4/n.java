package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20306l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20307a;
    public final h2.x f20308b;
    public final boolean[] f20309c = new boolean[4];
    public final l d;
    public final l0 f20310e;
    public m f20311f;
    public long f20312g;
    public String h;
    public i0 f20313i;
    public boolean f20314j;
    public long f20315k;

    public n(c0 c0Var) {
        this.f20307a = c0Var;
        ?? obj = new Object();
        obj.f20299e = new byte[128];
        this.d = obj;
        this.f20315k = -9223372036854775807L;
        this.f20310e = new l0(178);
        this.f20308b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20309c);
        l lVar = this.d;
        lVar.f20296a = false;
        lVar.f20298c = 0;
        lVar.f20297b = 0;
        m mVar = this.f20311f;
        if (mVar != null) {
            mVar.f20301b = false;
            mVar.f20302c = false;
            mVar.d = false;
            mVar.f20303e = -1;
        }
        l0 l0Var = this.f20310e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20312g = 0L;
        this.f20315k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20311f.getClass();
        if (z10) {
            this.f20311f.b(0, this.f20312g, this.f20314j);
            m mVar = this.f20311f;
            mVar.f20301b = false;
            mVar.f20302c = false;
            mVar.d = false;
            mVar.f20303e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20315k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20253e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20252c, 2);
        this.f20313i = d2;
        this.f20311f = new m(d2);
        this.f20307a.b(qVar, f0Var);
    }
}
