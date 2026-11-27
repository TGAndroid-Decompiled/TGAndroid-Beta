package defpackage;
public enum qub extends rwb {
    public qub() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.j()) {
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        char d = ik1Var.d();
        pub pubVar = rwb.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    bubVar.f(d);
                    bubVar.c = pubVar;
                    return;
                }
                bubVar.c = rwb.O;
                return;
            }
            bubVar.f(d);
            bubVar.c = rwb.N;
            return;
        }
        bubVar.m(this);
        bubVar.f((char) 65533);
        bubVar.c = pubVar;
    }
}
