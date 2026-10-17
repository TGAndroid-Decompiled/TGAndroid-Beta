package j4;

import c3.j0;
import i2.m0;
public final class n implements i {
    public static final float[] f14099l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f14100a;
    public final e2.x f14101b;
    public final boolean[] f14102c = new boolean[4];
    public final l d;
    public final m0 e;
    public m f14103f;
    public long f14104g;
    public String h;
    public j0 f14105i;
    public boolean f14106j;
    public long f14107k;

    public n(c0 c0Var) {
        this.f14100a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f14107k = -9223372036854775807L;
        this.e = new m0(178);
        this.f14101b = new e2.x();
    }

    @Override
    public final void a(e2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.x):void");
    }

    @Override
    public final void c() {
        f2.q.b(this.f14102c);
        l lVar = this.d;
        lVar.f14091a = false;
        lVar.f14093c = 0;
        lVar.f14092b = 0;
        m mVar = this.f14103f;
        if (mVar != null) {
            mVar.f14095b = false;
            mVar.f14096c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f14104g = 0L;
        this.f14107k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.f14052c, 2);
        this.f14105i = j02;
        this.f14103f = new m(j02);
        this.f14100a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        this.f14103f.getClass();
        if (z10) {
            this.f14103f.b(0, this.f14104g, this.f14106j);
            m mVar = this.f14103f;
            mVar.f14095b = false;
            mVar.f14096c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f14107k = j10;
    }
}
