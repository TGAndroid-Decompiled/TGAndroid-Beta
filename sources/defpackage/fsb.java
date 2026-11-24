package defpackage;
public enum fsb extends rub {
    public fsb() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(bsb bsbVar, hl1 hl1Var) {
        bsbVar.h("</".concat(bsbVar.h.toString()));
        hl1Var.q();
        bsbVar.c = rub.c;
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.o()) {
            String e = hl1Var.e();
            bsbVar.i.y(e);
            bsbVar.h.append(e);
            return;
        }
        char d = hl1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(bsbVar, hl1Var);
                } else if (bsbVar.n()) {
                    bsbVar.k();
                    bsbVar.c = rub.a;
                } else {
                    e(bsbVar, hl1Var);
                }
            } else if (bsbVar.n()) {
                bsbVar.c = rub.f0;
            } else {
                e(bsbVar, hl1Var);
            }
        } else if (bsbVar.n()) {
            bsbVar.c = rub.X;
        } else {
            e(bsbVar, hl1Var);
        }
    }
}
