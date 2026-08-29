package l4;

import j3.p2;
import j3.q2;
import j3.r2;
public final class w extends m1 {
    public final boolean f14450l;
    public final q2 f14451m;
    public final p2 f14452n;
    public u f14453o;
    public t f14454p;
    public boolean f14455q;
    public boolean f14456r;
    public boolean f14457s;

    public w(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14450l = z11;
        this.f14451m = new q2();
        this.f14452n = new p2();
        r2 g10 = aVar.g();
        if (g10 != null) {
            this.f14453o = new u(g10, null, null);
            this.f14457s = true;
            return;
        }
        this.f14453o = new u(new v(aVar.h()), q2.D, u.f14433e);
    }

    @Override
    public final t b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        boolean z10;
        t tVar = new t(c0Var, rVar, j10);
        if (tVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        a aVar = this.f14381k;
        tVar.d = aVar;
        if (this.f14456r) {
            Object obj = c0Var.f14262a;
            if (this.f14453o.d != null && obj.equals(u.f14433e)) {
                obj = this.f14453o.d;
            }
            tVar.d(c0Var.b(obj));
            return tVar;
        }
        this.f14454p = tVar;
        if (!this.f14455q) {
            this.f14455q = true;
            w(null, aVar);
        }
        return tVar;
    }

    public final void B(long j10) {
        t tVar = this.f14454p;
        int b10 = this.f14453o.b(tVar.f14424a.f14262a);
        if (b10 == -1) {
            return;
        }
        u uVar = this.f14453o;
        p2 p2Var = this.f14452n;
        uVar.f(b10, p2Var, false);
        long j11 = p2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        tVar.h = j10;
    }

    @Override
    public final void n(z zVar) {
        t tVar = (t) zVar;
        if (tVar.f14427e != null) {
            a aVar = tVar.d;
            aVar.getClass();
            aVar.n(tVar.f14427e);
        }
        if (zVar == this.f14454p) {
            this.f14454p = null;
        }
    }

    @Override
    public final void p() {
        this.f14456r = false;
        this.f14455q = false;
        super.p();
    }

    @Override
    public final c0 x(c0 c0Var) {
        Object obj = c0Var.f14262a;
        Object obj2 = this.f14453o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = u.f14433e;
        }
        return c0Var.b(obj);
    }

    @Override
    public final void y(j3.r2 r12) {
        throw new UnsupportedOperationException("Method not decompiled: l4.w.y(j3.r2):void");
    }

    @Override
    public final void z() {
        if (!this.f14450l) {
            this.f14455q = true;
            w(null, this.f14381k);
        }
    }

    @Override
    public final void j() {
    }
}
