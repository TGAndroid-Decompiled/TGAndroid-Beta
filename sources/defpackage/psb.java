package defpackage;
public enum psb extends rub {
    public psb() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.j()) {
            bsbVar.l(this);
            bsbVar.c = rub.a;
            return;
        }
        char i = hl1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    bsbVar.h(hl1Var.g('-', '<', 0));
                    return;
                } else {
                    bsbVar.a(rub.O);
                    return;
                }
            }
            bsbVar.f('-');
            bsbVar.a(rub.M);
            return;
        }
        bsbVar.m(this);
        hl1Var.a();
        bsbVar.f((char) 65533);
    }
}
