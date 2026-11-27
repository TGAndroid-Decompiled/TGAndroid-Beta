package defpackage;
public enum nvb extends rwb {
    public nvb() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.k("--")) {
            bubVar.n.s();
            bubVar.c = rwb.i0;
        } else if (ik1Var.l("DOCTYPE")) {
            bubVar.c = rwb.o0;
        } else if (ik1Var.k("[CDATA[")) {
            bubVar.e();
            bubVar.c = rwb.E0;
        } else {
            bubVar.m(this);
            bubVar.a(rwb.g0);
        }
    }
}
