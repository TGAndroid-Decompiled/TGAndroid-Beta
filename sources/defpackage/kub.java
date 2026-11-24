package defpackage;
public enum kub extends rub {
    public kub() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
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
            bsbVar.j();
            bsbVar.c = msbVar;
        }
    }
}
