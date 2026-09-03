package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class q extends v0 {
    public final boolean f16547l;
    public final n2 f16548m;
    public final m2 f16549n;
    public o f16550o;
    public n f16551p;
    public boolean f16552q;
    public boolean f16553r;
    public boolean f16554s;

    public q(a aVar, boolean z4) {
        super(aVar);
        boolean z10;
        if (z4 && aVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16547l = z10;
        this.f16548m = new n2();
        this.f16549n = new m2();
        o2 g10 = aVar.g();
        if (g10 != null) {
            this.f16550o = new o(g10, null, null);
            this.f16554s = true;
            return;
        }
        this.f16550o = new o(new p(aVar.h()), n2.E, o.f16540e);
    }

    @Override
    public final void n(t tVar) {
        n nVar = (n) tVar;
        if (nVar.f16538e != null) {
            a aVar = nVar.d;
            aVar.getClass();
            aVar.n(nVar.f16538e);
        }
        if (tVar == this.f16551p) {
            this.f16551p = null;
        }
    }

    @Override
    public final void p() {
        this.f16553r = false;
        this.f16552q = false;
        super.p();
    }

    @Override
    public final v s(v vVar) {
        Object obj = vVar.f16581a;
        Object obj2 = this.f16550o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = o.f16540e;
        }
        return vVar.b(obj);
    }

    @Override
    public final void u(j3.o2 r12) {
        throw new UnsupportedOperationException("Method not decompiled: o4.q.u(j3.o2):void");
    }

    @Override
    public final void w() {
        if (!this.f16547l) {
            this.f16552q = true;
            v(null, this.f16587k);
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
        a aVar = this.f16587k;
        nVar.d = aVar;
        if (this.f16553r) {
            Object obj = vVar.f16581a;
            if (this.f16550o.d != null && obj.equals(o.f16540e)) {
                obj = this.f16550o.d;
            }
            nVar.c(vVar.b(obj));
            return nVar;
        }
        this.f16551p = nVar;
        if (!this.f16552q) {
            this.f16552q = true;
            v(null, aVar);
        }
        return nVar;
    }

    public final void y(long j10) {
        n nVar = this.f16551p;
        int b10 = this.f16550o.b(nVar.f16535a.f16581a);
        if (b10 == -1) {
            return;
        }
        o oVar = this.f16550o;
        m2 m2Var = this.f16549n;
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
