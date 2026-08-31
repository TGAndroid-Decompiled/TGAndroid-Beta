package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class q extends v0 {
    public final boolean f16545l;
    public final n2 f16546m;
    public final m2 f16547n;
    public o f16548o;
    public n f16549p;
    public boolean f16550q;
    public boolean f16551r;
    public boolean f16552s;

    public q(a aVar, boolean z4) {
        super(aVar);
        boolean z10;
        if (z4 && aVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16545l = z10;
        this.f16546m = new n2();
        this.f16547n = new m2();
        o2 g10 = aVar.g();
        if (g10 != null) {
            this.f16548o = new o(g10, null, null);
            this.f16552s = true;
            return;
        }
        this.f16548o = new o(new p(aVar.h()), n2.E, o.f16538e);
    }

    @Override
    public final void n(t tVar) {
        n nVar = (n) tVar;
        if (nVar.f16536e != null) {
            a aVar = nVar.d;
            aVar.getClass();
            aVar.n(nVar.f16536e);
        }
        if (tVar == this.f16549p) {
            this.f16549p = null;
        }
    }

    @Override
    public final void p() {
        this.f16551r = false;
        this.f16550q = false;
        super.p();
    }

    @Override
    public final v s(v vVar) {
        Object obj = vVar.f16579a;
        Object obj2 = this.f16548o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = o.f16538e;
        }
        return vVar.b(obj);
    }

    @Override
    public final void u(j3.o2 r12) {
        throw new UnsupportedOperationException("Method not decompiled: o4.q.u(j3.o2):void");
    }

    @Override
    public final void w() {
        if (!this.f16545l) {
            this.f16550q = true;
            v(null, this.f16585k);
        }
    }

    @Override
    public final n b(v vVar, g5.q qVar, long j10) {
        boolean z4;
        n nVar = new n(vVar, qVar, j10);
        if (nVar.d == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        a aVar = this.f16585k;
        nVar.d = aVar;
        if (this.f16551r) {
            Object obj = vVar.f16579a;
            if (this.f16548o.d != null && obj.equals(o.f16538e)) {
                obj = this.f16548o.d;
            }
            nVar.c(vVar.b(obj));
            return nVar;
        }
        this.f16549p = nVar;
        if (!this.f16550q) {
            this.f16550q = true;
            v(null, aVar);
        }
        return nVar;
    }

    public final void y(long j10) {
        n nVar = this.f16549p;
        int b10 = this.f16548o.b(nVar.f16533a.f16579a);
        if (b10 == -1) {
            return;
        }
        o oVar = this.f16548o;
        m2 m2Var = this.f16547n;
        oVar.f(b10, m2Var, false);
        long j11 = m2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        nVar.h = j10;
    }

    @Override
    public final void j() {
    }
}
