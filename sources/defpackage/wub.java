package defpackage;
public enum wub extends rwb {
    public wub() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i != 0) {
            if (i != '-') {
                if (i != '<') {
                    if (i != 65535) {
                        bubVar.h(ik1Var.g('-', '<', 0));
                        return;
                    }
                    bubVar.l(this);
                    bubVar.c = rwb.a;
                    return;
                }
                bubVar.f(i);
                bubVar.a(rwb.V);
                return;
            }
            bubVar.f(i);
            bubVar.a(rwb.T);
            return;
        }
        bubVar.m(this);
        ik1Var.a();
        bubVar.f((char) 65533);
    }
}
