package defpackage;
public enum yvb extends rwb {
    public yvb() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        boolean j = ik1Var.j();
        mub mubVar = rwb.a;
        if (j) {
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        } else if (ik1Var.n('\t', '\n', '\r', '\f', ' ')) {
            ik1Var.a();
        } else if (ik1Var.m('>')) {
            bubVar.j();
            bubVar.a(mubVar);
        } else if (ik1Var.l("PUBLIC")) {
            bubVar.c = rwb.s0;
        } else if (ik1Var.l("SYSTEM")) {
            bubVar.c = rwb.y0;
        } else {
            bubVar.m(this);
            bubVar.a(rwb.D0);
        }
    }
}
