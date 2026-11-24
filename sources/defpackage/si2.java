package defpackage;

import java.util.ArrayList;
public final class si2 extends syc {
    public final ArrayList l;
    public final znb m;
    public final rq6 n;
    public qi2 o;
    public ri2 p;
    public long q;
    public long r;

    public si2(qx qxVar) {
        super((qg0) qxVar.c);
        this.n = new rq6((qq6) qxVar.d);
        this.l = new ArrayList();
        this.m = new znb();
    }

    @Override
    public final void A(aob aobVar) {
        if (this.p != null) {
            return;
        }
        C(aobVar);
    }

    public final void C(defpackage.aob r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.C(aob):void");
    }

    @Override
    public final boolean a(br6 br6Var) {
        qg0 qg0Var = this.k;
        if (qg0Var.a(br6Var) && qg0Var.i().e.equals(br6Var.e)) {
            return true;
        }
        return false;
    }

    @Override
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        pi2 pi2Var = new pi2(this.k.c(rx6Var, mv6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(pi2Var);
        return pi2Var;
    }

    @Override
    public final void k() {
        ri2 ri2Var = this.p;
        if (ri2Var == null) {
            super.k();
            return;
        }
        throw ri2Var;
    }

    @Override
    public final void o(sr6 sr6Var) {
        ArrayList arrayList = this.l;
        gre.p(arrayList.remove(sr6Var));
        this.k.o(((pi2) sr6Var).a);
        if (arrayList.isEmpty() && !this.n.e) {
            qi2 qi2Var = this.o;
            qi2Var.getClass();
            C(qi2Var.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
