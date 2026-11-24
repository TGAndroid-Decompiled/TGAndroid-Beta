package defpackage;
public enum etb extends rub {
    public etb() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        dtb dtbVar = rub.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        msb msbVar = rub.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        bsbVar.c = rub.a0;
                                        return;
                                    case '>':
                                        bsbVar.k();
                                        bsbVar.c = msbVar;
                                        return;
                                    default:
                                        bsbVar.i.A();
                                        hl1Var.q();
                                        bsbVar.c = dtbVar;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            bsbVar.l(this);
                            bsbVar.c = msbVar;
                            return;
                        }
                    } else {
                        bsbVar.c = rub.f0;
                        return;
                    }
                }
                bsbVar.m(this);
                bsbVar.i.A();
                bsbVar.i.u(d);
                bsbVar.c = dtbVar;
                return;
            }
            return;
        }
        bsbVar.m(this);
        bsbVar.i.u((char) 65533);
        bsbVar.c = dtbVar;
    }
}
