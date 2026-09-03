package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class q extends v0 {
    public final boolean f16376l;
    public final n2 f16377m;
    public final m2 f16378n;
    public o f16379o;
    public n f16380p;
    public boolean f16381q;
    public boolean f16382r;
    public boolean f16383s;

    public q(a aVar, boolean z4) {
        super(aVar);
        boolean z10;
        if (z4 && aVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16376l = z10;
        this.f16377m = new n2();
        this.f16378n = new m2();
        o2 g10 = aVar.g();
        if (g10 != null) {
            this.f16379o = new o(g10, null, null);
            this.f16383s = true;
            return;
        }
        this.f16379o = new o(new p(aVar.h()), n2.E, o.e);
    }

    @Override
    public final void n(t tVar) {
        n nVar = (n) tVar;
        if (nVar.e != null) {
            a aVar = nVar.d;
            aVar.getClass();
            aVar.n(nVar.e);
        }
        if (tVar == this.f16380p) {
            this.f16380p = null;
        }
    }

    @Override
    public final void p() {
        this.f16382r = false;
        this.f16381q = false;
        super.p();
    }

    @Override
    public final v s(v vVar) {
        Object obj = vVar.f16406a;
        Object obj2 = this.f16379o.d;
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
        if (!this.f16376l) {
            this.f16381q = true;
            v(null, this.f16411k);
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
        a aVar = this.f16411k;
        nVar.d = aVar;
        if (this.f16382r) {
            Object obj = vVar.f16406a;
            if (this.f16379o.d != null && obj.equals(o.e)) {
                obj = this.f16379o.d;
            }
            nVar.a(vVar.b(obj));
            return nVar;
        }
        this.f16380p = nVar;
        if (!this.f16381q) {
            this.f16381q = true;
            v(null, aVar);
        }
        return nVar;
    }

    public final void y(long j10) {
        n nVar = this.f16380p;
        int b10 = this.f16379o.b(nVar.f16366a.f16406a);
        if (b10 == -1) {
            return;
        }
        o oVar = this.f16379o;
        m2 m2Var = this.f16378n;
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
