package defpackage;
public enum itb extends rub {
    public itb() {
        super("Rcdata", 2);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char i = hl1Var.i();
        if (i != 0) {
            if (i != '&') {
                if (i != '<') {
                    if (i != 65535) {
                        bsbVar.h(hl1Var.g('&', '<', 0));
                        return;
                    } else {
                        bsbVar.g(new trb());
                        return;
                    }
                }
                bsbVar.a(rub.s);
                return;
            }
            bsbVar.a(rub.d);
            return;
        }
        bsbVar.m(this);
        hl1Var.a();
        bsbVar.f((char) 65533);
    }
}
