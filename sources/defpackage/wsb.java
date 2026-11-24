package defpackage;
public enum wsb extends rub {
    public wsb() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char i = hl1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    if (i != 65535) {
                        bsbVar.h(hl1Var.g('-', '<', 0));
                        return;
                    }
                    bsbVar.l(this);
                    bsbVar.c = rub.a;
                    return;
                }
                bsbVar.f(i);
                bsbVar.a(rub.V);
                return;
            }
            bsbVar.f(i);
            bsbVar.a(rub.T);
            return;
        }
        bsbVar.m(this);
        hl1Var.a();
        bsbVar.f((char) 65533);
    }
}
