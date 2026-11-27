package defpackage;
public final class ml6 extends i3d {
    public final boolean l;
    public final zrb m;
    public final xrb n;
    public kl6 o;
    public jl6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public ml6(rg0 rg0Var, boolean z) {
        super(rg0Var);
        boolean z2;
        if (z && rg0Var.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new zrb();
        this.n = new xrb();
        asb h = rg0Var.h();
        if (h != null) {
            this.o = new kl6(h, null, null);
            this.s = true;
            return;
        }
        this.o = new kl6(new ll6(rg0Var.i()), zrb.p, kl6.h);
    }

    @Override
    public final void A(defpackage.asb r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml6.A(asb):void");
    }

    @Override
    public final void B() {
        if (!this.l) {
            this.q = true;
            y(null, this.k);
        }
    }

    @Override
    public final jl6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        boolean z;
        jl6 jl6Var = new jl6(vz6Var, rx6Var, j);
        if (jl6Var.d == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        rg0 rg0Var = this.k;
        jl6Var.d = rg0Var;
        if (this.r) {
            Object obj = vz6Var.a;
            if (this.o.g != null && obj.equals(kl6.h)) {
                obj = this.o.g;
            }
            jl6Var.b(vz6Var.a(obj));
            return jl6Var;
        }
        this.p = jl6Var;
        if (!this.q) {
            this.q = true;
            y(null, rg0Var);
        }
        return jl6Var;
    }

    public final boolean D(long j) {
        jl6 jl6Var = this.p;
        int b = this.o.b(jl6Var.a.a);
        if (b == -1) {
            return false;
        }
        kl6 kl6Var = this.o;
        xrb xrbVar = this.n;
        kl6Var.f(b, xrbVar, false);
        long j2 = xrbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        jl6Var.h = j;
        return true;
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        return this.k.a(ft6Var);
    }

    @Override
    public final void o(xt6 xt6Var) {
        jl6 jl6Var = (jl6) xt6Var;
        if (jl6Var.e != null) {
            rg0 rg0Var = jl6Var.d;
            rg0Var.getClass();
            rg0Var.o(jl6Var.e);
        }
        if (xt6Var == this.p) {
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
    public final void t(ft6 ft6Var) {
        lsb lsbVar;
        if (this.s) {
            kl6 kl6Var = this.o;
            asb asbVar = kl6Var.e;
            if (asbVar instanceof lsb) {
                lsbVar = new lsb(((lsb) asbVar).e, ft6Var);
            } else {
                lsbVar = new lsb(asbVar, ft6Var);
            }
            this.o = new kl6(lsbVar, kl6Var.f, kl6Var.g);
        } else {
            this.o = new kl6(new ll6(ft6Var), zrb.p, kl6.h);
        }
        this.k.t(ft6Var);
    }

    @Override
    public final vz6 z(vz6 vz6Var) {
        Object obj = vz6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = kl6.h;
        }
        return vz6Var.a(obj);
    }
}
