package defpackage;
public enum lvb extends rwb {
    public lvb() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d != '>') {
            if (d != 65535) {
                bubVar.m(this);
                ik1Var.q();
                bubVar.c = rwb.X;
                return;
            }
            bubVar.l(this);
            bubVar.c = mubVar;
            return;
        }
        bubVar.i.l = true;
        bubVar.k();
        bubVar.c = mubVar;
    }
}
