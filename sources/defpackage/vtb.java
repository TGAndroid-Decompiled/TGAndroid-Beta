package defpackage;
public enum vtb extends rub {
    public vtb() {
        super("Doctype", 50);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        wtb wtbVar = rub.p0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    bsbVar.m(this);
                    bsbVar.c = wtbVar;
                    return;
                }
                bsbVar.l(this);
            }
            bsbVar.m(this);
            bsbVar.m.s();
            bsbVar.j();
            bsbVar.c = rub.a;
            return;
        }
        bsbVar.c = wtbVar;
    }
}
