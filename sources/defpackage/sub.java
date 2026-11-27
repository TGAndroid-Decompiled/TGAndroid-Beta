package defpackage;
public enum sub extends rwb {
    public sub() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.e();
            bubVar.h.append(ik1Var.i());
            bubVar.h("<" + ik1Var.i());
            bubVar.a(rwb.R);
        } else if (ik1Var.m('/')) {
            bubVar.e();
            bubVar.a(rwb.P);
        } else {
            bubVar.f('<');
            bubVar.c = rwb.L;
        }
    }
}
