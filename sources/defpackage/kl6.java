package defpackage;
public final class kl6 extends t0d {
    public final boolean l;
    public final aqb m;
    public final ypb n;
    public il6 o;
    public hl6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public kl6(rh0 rh0Var, boolean z) {
        super(rh0Var);
        boolean z2;
        if (z && rh0Var.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new aqb();
        this.n = new ypb();
        bqb h = rh0Var.h();
        if (h != null) {
            this.o = new il6(h, null, null);
            this.s = true;
            return;
        }
        this.o = new il6(new jl6(rh0Var.i()), aqb.p, il6.h);
    }

    @Override
    public final void A(defpackage.bqb r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.A(bqb):void");
    }

    @Override
    public final void B() {
        if (!this.l) {
            this.q = true;
            y(null, this.k);
        }
    }

    @Override
    public final hl6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        boolean z;
        hl6 hl6Var = new hl6(rz6Var, mx6Var, j);
        if (hl6Var.d == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        rh0 rh0Var = this.k;
        hl6Var.d = rh0Var;
        if (this.r) {
            Object obj = rz6Var.a;
            if (this.o.g != null && obj.equals(il6.h)) {
                obj = this.o.g;
            }
            hl6Var.d(rz6Var.a(obj));
            return hl6Var;
        }
        this.p = hl6Var;
        if (!this.q) {
            this.q = true;
            y(null, rh0Var);
        }
        return hl6Var;
    }

    public final boolean D(long j) {
        hl6 hl6Var = this.p;
        int b = this.o.b(hl6Var.a.a);
        if (b == -1) {
            return false;
        }
        il6 il6Var = this.o;
        ypb ypbVar = this.n;
        il6Var.f(b, ypbVar, false);
        long j2 = ypbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        hl6Var.h = j;
        return true;
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        return this.k.a(bt6Var);
    }

    @Override
    public final void o(tt6 tt6Var) {
        hl6 hl6Var = (hl6) tt6Var;
        if (hl6Var.e != null) {
            rh0 rh0Var = hl6Var.d;
            rh0Var.getClass();
            rh0Var.o(hl6Var.e);
        }
        if (tt6Var == this.p) {
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
    public final void t(bt6 bt6Var) {
        mqb mqbVar;
        if (this.s) {
            il6 il6Var = this.o;
            bqb bqbVar = il6Var.e;
            if (bqbVar instanceof mqb) {
                mqbVar = new mqb(((mqb) bqbVar).e, bt6Var);
            } else {
                mqbVar = new mqb(bqbVar, bt6Var);
            }
            this.o = new il6(mqbVar, il6Var.f, il6Var.g);
        } else {
            this.o = new il6(new jl6(bt6Var), aqb.p, il6.h);
        }
        this.k.t(bt6Var);
    }

    @Override
    public final rz6 z(rz6 rz6Var) {
        Object obj = rz6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = il6.h;
        }
        return rz6Var.a(obj);
    }
}
