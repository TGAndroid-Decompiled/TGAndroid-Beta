package j4;

import c3.h0;
import i2.l0;
public final class n implements i {
    public static final float[] f13348l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f13349a;
    public final e2.v f13350b;
    public final boolean[] f13351c = new boolean[4];
    public final l d;
    public final l0 f13352e;
    public m f13353f;
    public long f13354g;
    public String h;
    public h0 f13355i;
    public boolean f13356j;
    public long f13357k;

    public n(c0 c0Var) {
        this.f13349a = c0Var;
        ?? obj = new Object();
        obj.f13341e = new byte[128];
        this.d = obj;
        this.f13357k = -9223372036854775807L;
        this.f13352e = new l0(178);
        this.f13350b = new e2.v();
    }

    @Override
    public final void b(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.b(e2.v):void");
    }

    @Override
    public final void d() {
        f2.p.a(this.f13351c);
        l lVar = this.d;
        lVar.f13338a = false;
        lVar.f13340c = 0;
        lVar.f13339b = 0;
        m mVar = this.f13353f;
        if (mVar != null) {
            mVar.f13343b = false;
            mVar.f13344c = false;
            mVar.d = false;
            mVar.f13345e = -1;
        }
        l0 l0Var = this.f13352e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f13354g = 0L;
        this.f13357k = -9223372036854775807L;
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.f13295e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13355i = R1;
        this.f13353f = new m(R1);
        this.f13349a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13353f);
        if (z10) {
            this.f13353f.b(0, this.f13354g, this.f13356j);
            m mVar = this.f13353f;
            mVar.f13343b = false;
            mVar.f13344c = false;
            mVar.d = false;
            mVar.f13345e = -1;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13357k = j3;
    }
}
