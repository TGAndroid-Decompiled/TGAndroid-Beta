package defpackage;
public enum ivb extends rwb {
    public ivb() {
        super("Rcdata", 2);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i != 0) {
            if (i != '&') {
                if (i != '<') {
                    if (i != 65535) {
                        bubVar.h(ik1Var.g('&', '<', 0));
                        return;
                    } else {
                        bubVar.g(new ttb());
                        return;
                    }
                }
                bubVar.a(rwb.s);
                return;
            }
            bubVar.a(rwb.d);
            return;
        }
        bubVar.m(this);
        ik1Var.a();
        bubVar.f((char) 65533);
    }
}
