package defpackage;
public enum vvb extends rwb {
    public vvb() {
        super("Doctype", 50);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wvb wvbVar = rwb.p0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    bubVar.m(this);
                    bubVar.c = wvbVar;
                    return;
                }
                bubVar.l(this);
            }
            bubVar.m(this);
            bubVar.m.s();
            bubVar.j();
            bubVar.c = rwb.a;
            return;
        }
        bubVar.c = wvbVar;
    }
}
