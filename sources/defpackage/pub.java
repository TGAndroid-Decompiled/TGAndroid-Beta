package defpackage;
public enum pub extends rwb {
    public pub() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.j()) {
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        char i = ik1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    bubVar.h(ik1Var.g('-', '<', 0));
                    return;
                } else {
                    bubVar.a(rwb.O);
                    return;
                }
            }
            bubVar.f('-');
            bubVar.a(rwb.M);
            return;
        }
        bubVar.m(this);
        ik1Var.a();
        bubVar.f((char) 65533);
    }
}
