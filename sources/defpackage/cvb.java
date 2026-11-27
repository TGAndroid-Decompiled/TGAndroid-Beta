package defpackage;
public enum cvb extends rwb {
    public cvb() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        dvb dvbVar = rwb.Y;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        mub mubVar = rwb.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        bubVar.k();
                                        bubVar.c = mubVar;
                                        return;
                                    default:
                                        bubVar.i.A();
                                        ik1Var.q();
                                        bubVar.c = dvbVar;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            bubVar.l(this);
                            bubVar.c = mubVar;
                            return;
                        }
                    } else {
                        bubVar.c = rwb.f0;
                        return;
                    }
                }
                bubVar.m(this);
                bubVar.i.A();
                bubVar.i.u(d);
                bubVar.c = dvbVar;
                return;
            }
            return;
        }
        bubVar.m(this);
        bubVar.i.A();
        ik1Var.q();
        bubVar.c = dvbVar;
    }
}
