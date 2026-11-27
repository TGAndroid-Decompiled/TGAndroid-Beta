package defpackage;
public enum kwb extends rwb {
    public kwb() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            mub mubVar = rwb.a;
            if (d != '>') {
                if (d != 65535) {
                    bubVar.m(this);
                    bubVar.c = rwb.D0;
                    return;
                }
                bubVar.l(this);
                bubVar.j();
                bubVar.c = mubVar;
                return;
            }
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
