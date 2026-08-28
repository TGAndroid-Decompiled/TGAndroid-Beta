package j4;

import h3.p2;
import h3.q2;
import h3.r2;
public final class x extends l1 {
    public final boolean f13598l;
    public final q2 f13599m;
    public final p2 f13600n;
    public v f13601o;
    public u f13602p;
    public boolean f13603q;
    public boolean f13604r;
    public boolean f13605s;

    public x(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13598l = z11;
        this.f13599m = new q2();
        this.f13600n = new p2();
        r2 g10 = aVar.g();
        if (g10 != null) {
            this.f13601o = new v(g10, null, null);
            this.f13605s = true;
            return;
        }
        this.f13601o = new v(new w(aVar.h()), q2.D, v.f13586e);
    }

    @Override
    public final u b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        boolean z10;
        u uVar = new u(d0Var, rVar, j10);
        if (uVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        a aVar = this.f13504k;
        uVar.d = aVar;
        if (this.f13604r) {
            Object obj = d0Var.f13426a;
            if (this.f13601o.d != null && obj.equals(v.f13586e)) {
                obj = this.f13601o.d;
            }
            uVar.a(d0Var.b(obj));
            return uVar;
        }
        this.f13602p = uVar;
        if (!this.f13603q) {
            this.f13603q = true;
            w(null, aVar);
        }
        return uVar;
    }

    public final void B(long j10) {
        u uVar = this.f13602p;
        int b10 = this.f13601o.b(uVar.f13570a.f13426a);
        if (b10 == -1) {
            return;
        }
        v vVar = this.f13601o;
        p2 p2Var = this.f13600n;
        vVar.f(b10, p2Var, false);
        long j11 = p2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        uVar.h = j10;
    }

    @Override
    public final void n(a0 a0Var) {
        u uVar = (u) a0Var;
        if (uVar.f13573e != null) {
            a aVar = uVar.d;
            aVar.getClass();
            aVar.n(uVar.f13573e);
        }
        if (a0Var == this.f13602p) {
            this.f13602p = null;
        }
    }

    @Override
    public final void p() {
        this.f13604r = false;
        this.f13603q = false;
        super.p();
    }

    @Override
    public final d0 x(d0 d0Var) {
        Object obj = d0Var.f13426a;
        Object obj2 = this.f13601o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = v.f13586e;
        }
        return d0Var.b(obj);
    }

    @Override
    public final void y(h3.r2 r12) {
        throw new UnsupportedOperationException("Method not decompiled: j4.x.y(h3.r2):void");
    }

    @Override
    public final void z() {
        if (!this.f13598l) {
            this.f13603q = true;
            w(null, this.f13504k);
        }
    }

    @Override
    public final void j() {
    }
}
