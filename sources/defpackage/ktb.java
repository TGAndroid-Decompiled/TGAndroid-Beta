package defpackage;
public enum ktb extends rub {
    public ktb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        ctb ctbVar = rub.X;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                msb msbVar = rub.a;
                if (d != '>') {
                    if (d != 65535) {
                        bsbVar.m(this);
                        hl1Var.q();
                        bsbVar.c = ctbVar;
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.c = msbVar;
                    return;
                }
                bsbVar.k();
                bsbVar.c = msbVar;
                return;
            }
            bsbVar.c = rub.f0;
            return;
        }
        bsbVar.c = ctbVar;
    }
}
