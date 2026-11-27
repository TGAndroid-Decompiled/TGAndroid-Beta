package defpackage;
public enum dvb extends rwb {
    public dvb() {
        super("AttributeName", 34);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String h = ik1Var.h(rwb.H0);
        wtb wtbVar = bubVar.i;
        String str = wtbVar.g;
        if (str != null) {
            h = str.concat(h);
        }
        wtbVar.g = h;
        char d = ik1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        mub mubVar = rwb.a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        bubVar.c = rwb.a0;
                                        return;
                                    case '>':
                                        bubVar.k();
                                        bubVar.c = mubVar;
                                        return;
                                    default:
                                        bubVar.i.u(d);
                                        return;
                                }
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
                bubVar.i.u(d);
                return;
            }
            bubVar.c = rwb.Z;
            return;
        }
        bubVar.m(this);
        bubVar.i.u((char) 65533);
    }
}
