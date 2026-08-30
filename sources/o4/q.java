package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class q extends v0 {
    public final boolean f16394l;
    public final n2 f16395m;
    public final m2 f16396n;
    public o f16397o;
    public n f16398p;
    public boolean f16399q;
    public boolean f16400r;
    public boolean f16401s;

    public q(a aVar, boolean z4) {
        super(aVar);
        boolean z10;
        if (z4 && aVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16394l = z10;
        this.f16395m = new n2();
        this.f16396n = new m2();
        o2 g10 = aVar.g();
        if (g10 != null) {
            this.f16397o = new o(g10, null, null);
            this.f16401s = true;
            return;
        }
        this.f16397o = new o(new p(aVar.h()), n2.E, o.e);
    }

    @Override
    public final void n(t tVar) {
        n nVar = (n) tVar;
        if (nVar.e != null) {
            a aVar = nVar.d;
            aVar.getClass();
            aVar.n(nVar.e);
        }
        if (tVar == this.f16398p) {
            this.f16398p = null;
        }
    }

    @Override
    public final void p() {
        this.f16400r = false;
        this.f16399q = false;
        super.p();
    }

    @Override
    public final v s(v vVar) {
        Object obj = vVar.f16424a;
        Object obj2 = this.f16397o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = o.e;
        }
        return vVar.b(obj);
    }

    @Override
    public final void u(j3.o2 r12) {
        throw new UnsupportedOperationException("Method not decompiled: o4.q.u(j3.o2):void");
    }

    @Override
    public final void w() {
        if (!this.f16394l) {
            this.f16399q = true;
            v(null, this.f16429k);
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
        a aVar = this.f16429k;
        nVar.d = aVar;
        if (this.f16400r) {
            Object obj = vVar.f16424a;
            if (this.f16397o.d != null && obj.equals(o.e)) {
                obj = this.f16397o.d;
            }
            nVar.a(vVar.b(obj));
            return nVar;
        }
        this.f16398p = nVar;
        if (!this.f16399q) {
            this.f16399q = true;
            v(null, aVar);
        }
        return nVar;
    }

    public final void y(long j10) {
        n nVar = this.f16398p;
        int b10 = this.f16397o.b(nVar.f16384a.f16424a);
        if (b10 == -1) {
            return;
        }
        o oVar = this.f16397o;
        m2 m2Var = this.f16396n;
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
