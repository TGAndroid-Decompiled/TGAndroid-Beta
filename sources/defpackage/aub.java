package defpackage;
public enum aub extends rub {
    public aub() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    msb msbVar = rub.a;
                    if (d != '>') {
                        if (d != 65535) {
                            bsbVar.m(this);
                            bsbVar.c = rub.D0;
                            return;
                        }
                        bsbVar.l(this);
                        bsbVar.j();
                        bsbVar.c = msbVar;
                        return;
                    }
                    bsbVar.m(this);
                    bsbVar.j();
                    bsbVar.c = msbVar;
                    return;
                }
                bsbVar.c = rub.v0;
                return;
            }
            bsbVar.c = rub.u0;
        }
    }
}
