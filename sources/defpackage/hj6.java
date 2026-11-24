package defpackage;
public final class hj6 extends syc {
    public final boolean l;
    public final znb m;
    public final xnb n;
    public fj6 o;
    public ej6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public hj6(qg0 qg0Var, boolean z) {
        super(qg0Var);
        boolean z2;
        if (z && qg0Var.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new znb();
        this.n = new xnb();
        aob h = qg0Var.h();
        if (h != null) {
            this.o = new fj6(h, null, null);
            this.s = true;
            return;
        }
        this.o = new fj6(new gj6(qg0Var.i()), znb.p, fj6.h);
    }

    @Override
    public final void A(defpackage.aob r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj6.A(aob):void");
    }

    @Override
    public final void B() {
        if (!this.l) {
            this.q = true;
            y(null, this.k);
        }
    }

    @Override
    public final ej6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        boolean z;
        ej6 ej6Var = new ej6(rx6Var, mv6Var, j);
        if (ej6Var.d == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        qg0 qg0Var = this.k;
        ej6Var.d = qg0Var;
        if (this.r) {
            Object obj = rx6Var.a;
            if (this.o.g != null && obj.equals(fj6.h)) {
                obj = this.o.g;
            }
            ej6Var.c(rx6Var.a(obj));
            return ej6Var;
        }
        this.p = ej6Var;
        if (!this.q) {
            this.q = true;
            y(null, qg0Var);
        }
        return ej6Var;
    }

    public final boolean D(long j) {
        ej6 ej6Var = this.p;
        int b = this.o.b(ej6Var.a.a);
        if (b == -1) {
            return false;
        }
        fj6 fj6Var = this.o;
        xnb xnbVar = this.n;
        fj6Var.f(b, xnbVar, false);
        long j2 = xnbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ej6Var.h = j;
        return true;
    }

    @Override
    public final boolean a(br6 br6Var) {
        return this.k.a(br6Var);
    }

    @Override
    public final void o(sr6 sr6Var) {
        ej6 ej6Var = (ej6) sr6Var;
        if (ej6Var.e != null) {
            qg0 qg0Var = ej6Var.d;
            qg0Var.getClass();
            qg0Var.o(ej6Var.e);
        }
        if (sr6Var == this.p) {
            this.p = null;
        }
    }

    @Override
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override
    public final void t(br6 br6Var) {
        lob lobVar;
        if (this.s) {
            fj6 fj6Var = this.o;
            aob aobVar = fj6Var.e;
            if (aobVar instanceof lob) {
                lobVar = new lob(((lob) aobVar).e, br6Var);
            } else {
                lobVar = new lob(aobVar, br6Var);
            }
            this.o = new fj6(lobVar, fj6Var.f, fj6Var.g);
        } else {
            this.o = new fj6(new gj6(br6Var), znb.p, fj6.h);
        }
        this.k.t(br6Var);
    }

    @Override
    public final rx6 z(rx6 rx6Var) {
        Object obj = rx6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = fj6.h;
        }
        return rx6Var.a(obj);
    }
}
