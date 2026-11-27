package defpackage;
public enum lwb extends rwb {
    public lwb() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        mub mubVar = rwb.a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            bubVar.j();
            bubVar.c = mubVar;
            return;
        }
        bubVar.j();
        bubVar.c = mubVar;
    }
}
