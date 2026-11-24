package defpackage;
public enum urb extends qsb {
    public urb() {
        super("Doctype", 50);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        vrb vrbVar = qsb.p0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    aqbVar.m(this);
                    aqbVar.c = vrbVar;
                    return;
                }
                aqbVar.l(this);
            }
            aqbVar.m(this);
            aqbVar.m.s();
            aqbVar.j();
            aqbVar.c = qsb.a;
            return;
        }
        aqbVar.c = vrbVar;
    }
}
