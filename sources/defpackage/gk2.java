package defpackage;

import java.util.ArrayList;
public final class gk2 extends t0d {
    public final ArrayList l;
    public final aqb m;
    public final rs6 n;
    public ek2 o;
    public fk2 p;
    public long q;
    public long r;

    public gk2(ry ryVar) {
        super((rh0) ryVar.c);
        this.n = new rs6((qs6) ryVar.d);
        this.l = new ArrayList();
        this.m = new aqb();
    }

    @Override
    public final void A(bqb bqbVar) {
        if (this.p != null) {
            return;
        }
        C(bqbVar);
    }

    public final void C(defpackage.bqb r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.C(bqb):void");
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        rh0 rh0Var = this.k;
        if (rh0Var.a(bt6Var) && rh0Var.i().e.equals(bt6Var.e)) {
            return true;
        }
        return false;
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        dk2 dk2Var = new dk2(this.k.c(rz6Var, mx6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(dk2Var);
        return dk2Var;
    }

    @Override
    public final void k() {
        fk2 fk2Var = this.p;
        if (fk2Var == null) {
            super.k();
            return;
        }
        throw fk2Var;
    }

    @Override
    public final void o(tt6 tt6Var) {
        ArrayList arrayList = this.l;
        jte.p(arrayList.remove(tt6Var));
        this.k.o(((dk2) tt6Var).a);
        if (arrayList.isEmpty() && !this.n.e) {
            ek2 ek2Var = this.o;
            ek2Var.getClass();
            C(ek2Var.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
