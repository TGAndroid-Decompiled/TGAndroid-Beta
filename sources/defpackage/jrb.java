package defpackage;
public enum jrb extends qsb {
    public jrb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        brb brbVar = qsb.X;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                lqb lqbVar = qsb.a;
                if (d != '>') {
                    if (d != 65535) {
                        aqbVar.m(this);
                        zj1Var.q();
                        aqbVar.c = brbVar;
                        return;
                    }
                    aqbVar.l(this);
                    aqbVar.c = lqbVar;
                    return;
                }
                aqbVar.k();
                aqbVar.c = lqbVar;
                return;
            }
            aqbVar.c = qsb.f0;
            return;
        }
        aqbVar.c = brbVar;
    }
}
