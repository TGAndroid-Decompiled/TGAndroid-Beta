package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20698l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20699a;
    public final h2.x f20700b;
    public final boolean[] f20701c = new boolean[4];
    public final l d;
    public final l0 f20702e;
    public m f20703f;
    public long f20704g;
    public String h;
    public i0 f20705i;
    public boolean f20706j;
    public long f20707k;

    public n(c0 c0Var) {
        this.f20699a = c0Var;
        ?? obj = new Object();
        obj.f20691e = new byte[128];
        this.d = obj;
        this.f20707k = -9223372036854775807L;
        this.f20702e = new l0(178);
        this.f20700b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20701c);
        l lVar = this.d;
        lVar.f20688a = false;
        lVar.f20690c = 0;
        lVar.f20689b = 0;
        m mVar = this.f20703f;
        if (mVar != null) {
            mVar.f20693b = false;
            mVar.f20694c = false;
            mVar.d = false;
            mVar.f20695e = -1;
        }
        l0 l0Var = this.f20702e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20704g = 0L;
        this.f20707k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20703f.getClass();
        if (z10) {
            this.f20703f.b(0, this.f20704g, this.f20706j);
            m mVar = this.f20703f;
            mVar.f20693b = false;
            mVar.f20694c = false;
            mVar.d = false;
            mVar.f20695e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20707k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20645e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20644c, 2);
        this.f20705i = d2;
        this.f20703f = new m(d2);
        this.f20699a.b(qVar, f0Var);
    }
}
