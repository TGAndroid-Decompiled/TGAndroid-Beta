package defpackage;
public enum wtb extends rub {
    public wtb() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        srb srbVar = bsbVar.m;
        boolean o = hl1Var.o();
        xtb xtbVar = rub.q0;
        if (o) {
            srbVar.s();
            bsbVar.c = xtbVar;
            return;
        }
        char d = hl1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        srbVar.s();
                        srbVar.e.append(d);
                        bsbVar.c = xtbVar;
                        return;
                    }
                    return;
                }
                bsbVar.l(this);
                srbVar.s();
                bsbVar.j();
                bsbVar.c = rub.a;
                return;
            }
            return;
        }
        bsbVar.m(this);
        srbVar.s();
        srbVar.e.append((char) 65533);
        bsbVar.c = xtbVar;
    }
}
