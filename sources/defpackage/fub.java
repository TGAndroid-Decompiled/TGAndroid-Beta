package defpackage;
public enum fub extends rwb {
    public fub() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(bub bubVar, ik1 ik1Var) {
        bubVar.h("</".concat(bubVar.h.toString()));
        ik1Var.q();
        bubVar.c = rwb.c;
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            String e = ik1Var.e();
            bubVar.i.y(e);
            bubVar.h.append(e);
            return;
        }
        char d = ik1Var.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(bubVar, ik1Var);
                } else if (bubVar.n()) {
                    bubVar.k();
                    bubVar.c = rwb.a;
                } else {
                    e(bubVar, ik1Var);
                }
            } else if (bubVar.n()) {
                bubVar.c = rwb.f0;
            } else {
                e(bubVar, ik1Var);
            }
        } else if (bubVar.n()) {
            bubVar.c = rwb.X;
        } else {
            e(bubVar, ik1Var);
        }
    }
}
