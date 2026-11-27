package defpackage;
public enum gwb extends rwb {
    public gwb() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    mub mubVar = rwb.a;
                    if (d != '>') {
                        if (d != 65535) {
                            bubVar.m(this);
                            bubVar.j();
                            return;
                        }
                        bubVar.l(this);
                        bubVar.j();
                        bubVar.c = mubVar;
                        return;
                    }
                    bubVar.m(this);
                    bubVar.j();
                    bubVar.c = mubVar;
                    return;
                }
                bubVar.m(this);
                bubVar.c = rwb.B0;
                return;
            }
            bubVar.m(this);
            bubVar.c = rwb.A0;
            return;
        }
        bubVar.c = rwb.z0;
    }
}
