package defpackage;
public enum eqb extends qsb {
    public eqb() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(aqb aqbVar, zj1 zj1Var) {
        aqbVar.h("</".concat(aqbVar.h.toString()));
        zj1Var.q();
        aqbVar.c = qsb.c;
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            String e = zj1Var.e();
            aqbVar.i.y(e);
            aqbVar.h.append(e);
            return;
        }
        char d = zj1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(aqbVar, zj1Var);
                } else if (aqbVar.n()) {
                    aqbVar.k();
                    aqbVar.c = qsb.a;
                } else {
                    e(aqbVar, zj1Var);
                }
            } else if (aqbVar.n()) {
                aqbVar.c = qsb.f0;
            } else {
                e(aqbVar, zj1Var);
            }
        } else if (aqbVar.n()) {
            aqbVar.c = qsb.X;
        } else {
            e(aqbVar, zj1Var);
        }
    }
}
