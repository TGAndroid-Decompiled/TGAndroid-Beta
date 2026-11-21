package m4;

import f3.i0;
import l2.l0;
public final class n implements i {
    public static final float[] f20695l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 f20696a;
    public final h2.x f20697b;
    public final boolean[] f20698c = new boolean[4];
    public final l d;
    public final l0 f20699e;
    public m f20700f;
    public long f20701g;
    public String h;
    public i0 f20702i;
    public boolean f20703j;
    public long f20704k;

    public n(c0 c0Var) {
        this.f20696a = c0Var;
        ?? obj = new Object();
        obj.f20688e = new byte[128];
        this.d = obj;
        this.f20704k = -9223372036854775807L;
        this.f20699e = new l0(178);
        this.f20697b = new h2.x();
    }

    @Override
    public final void c(h2.x r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n.c(h2.x):void");
    }

    @Override
    public final void d() {
        i2.o.b(this.f20698c);
        l lVar = this.d;
        lVar.f20685a = false;
        lVar.f20687c = 0;
        lVar.f20686b = 0;
        m mVar = this.f20700f;
        if (mVar != null) {
            mVar.f20690b = false;
            mVar.f20691c = false;
            mVar.d = false;
            mVar.f20692e = -1;
        }
        l0 l0Var = this.f20699e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.f20701g = 0L;
        this.f20704k = -9223372036854775807L;
    }

    @Override
    public final void e(boolean z10) {
        this.f20700f.getClass();
        if (z10) {
            this.f20700f.b(0, this.f20701g, this.f20703j);
            m mVar = this.f20700f;
            mVar.f20690b = false;
            mVar.f20691c = false;
            mVar.d = false;
            mVar.f20692e = -1;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20704k = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.f20642e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20641c, 2);
        this.f20702i = d2;
        this.f20700f = new m(d2);
        this.f20696a.b(qVar, f0Var);
    }
}
