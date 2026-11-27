package defpackage;

import java.util.ArrayList;
public final class oj2 extends i3d {
    public final ArrayList l;
    public final zrb m;
    public final vs6 n;
    public mj2 o;
    public nj2 p;
    public long q;
    public long r;

    public oj2(rx rxVar) {
        super((rg0) rxVar.c);
        this.n = new vs6((us6) rxVar.d);
        this.l = new ArrayList();
        this.m = new zrb();
    }

    @Override
    public final void A(asb asbVar) {
        if (this.p != null) {
            return;
        }
        C(asbVar);
    }

    public final void C(defpackage.asb r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj2.C(asb):void");
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        rg0 rg0Var = this.k;
        if (rg0Var.a(ft6Var) && rg0Var.i().e.equals(ft6Var.e)) {
            return true;
        }
        return false;
    }

    @Override
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        lj2 lj2Var = new lj2(this.k.c(vz6Var, rx6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(lj2Var);
        return lj2Var;
    }

    @Override
    public final void k() {
        nj2 nj2Var = this.p;
        if (nj2Var == null) {
            super.k();
            return;
        }
        throw nj2Var;
    }

    @Override
    public final void o(xt6 xt6Var) {
        ArrayList arrayList = this.l;
        yve.p(arrayList.remove(xt6Var));
        this.k.o(((lj2) xt6Var).a);
        if (arrayList.isEmpty() && !this.n.e) {
            mj2 mj2Var = this.o;
            mj2Var.getClass();
            C(mj2Var.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
