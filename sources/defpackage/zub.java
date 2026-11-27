package defpackage;
public enum zub extends rwb {
    public zub() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wub wubVar = rwb.S;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            bubVar.f(d);
                            bubVar.c = wubVar;
                            return;
                        }
                        bubVar.l(this);
                        bubVar.c = rwb.a;
                        return;
                    }
                    bubVar.f(d);
                    bubVar.c = rwb.f;
                    return;
                }
                bubVar.f(d);
                bubVar.c = rwb.V;
                return;
            }
            bubVar.f(d);
            return;
        }
        bubVar.m(this);
        bubVar.f((char) 65533);
        bubVar.c = wubVar;
    }
}
