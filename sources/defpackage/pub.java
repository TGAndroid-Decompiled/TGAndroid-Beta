package defpackage;
public enum pub extends rub {
    public pub() {
        super("TagOpen", 7);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char i = hl1Var.i();
        if (i != '!') {
            if (i != '/') {
                if (i != '?') {
                    if (hl1Var.o()) {
                        bsbVar.d(true);
                        bsbVar.c = rub.r;
                        return;
                    }
                    bsbVar.m(this);
                    bsbVar.f('<');
                    bsbVar.c = rub.a;
                    return;
                }
                bsbVar.a(rub.g0);
                return;
            }
            bsbVar.a(rub.n);
            return;
        }
        bsbVar.a(rub.h0);
    }
}
