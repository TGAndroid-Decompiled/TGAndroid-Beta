package j4;

import c3.h0;
import i2.m0;
public final class n implements i {
    public static final float[] f12720l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f12721a;
    public final e2.v f12722b;
    public final boolean[] f12723c = new boolean[4];
    public final l d;
    public final m0 e;
    public m f12724f;
    public long f12725g;
    public String h;
    public h0 f12726i;
    public boolean f12727j;
    public long f12728k;

    public n(c0 c0Var) {
        this.f12721a = c0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f12728k = -9223372036854775807L;
        this.e = new m0(178);
        this.f12722b = new e2.v();
    }

    @Override
    public final void a(e2.v r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.n.a(e2.v):void");
    }

    @Override
    public final void c() {
        f2.o.a(this.f12723c);
        l lVar = this.d;
        lVar.f12712a = false;
        lVar.f12714c = 0;
        lVar.f12713b = 0;
        m mVar = this.f12724f;
        if (mVar != null) {
            mVar.f12716b = false;
            mVar.f12717c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.g();
        }
        this.f12725g = 0L;
        this.f12728k = -9223372036854775807L;
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12726i = Z1;
        this.f12724f = new m(Z1);
        this.f12721a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12724f);
        if (z10) {
            this.f12724f.b(0, this.f12725g, this.f12727j);
            m mVar = this.f12724f;
            mVar.f12716b = false;
            mVar.f12717c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12728k = j3;
    }
}
