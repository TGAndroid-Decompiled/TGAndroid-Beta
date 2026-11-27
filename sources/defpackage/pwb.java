package defpackage;
public enum pwb extends rwb {
    public pwb() {
        super("TagOpen", 7);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i != '!') {
            if (i != '/') {
                if (i != '?') {
                    if (ik1Var.o()) {
                        bubVar.d(true);
                        bubVar.c = rwb.r;
                        return;
                    }
                    bubVar.m(this);
                    bubVar.f('<');
                    bubVar.c = rwb.a;
                    return;
                }
                bubVar.a(rwb.g0);
                return;
            }
            bubVar.a(rwb.n);
            return;
        }
        bubVar.a(rwb.h0);
    }
}
