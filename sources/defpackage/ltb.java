package defpackage;
public enum ltb extends rub {
    public ltb() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        msb msbVar = rub.a;
        if (d != '>') {
            if (d != 65535) {
                bsbVar.m(this);
                hl1Var.q();
                bsbVar.c = rub.X;
                return;
            }
            bsbVar.l(this);
            bsbVar.c = msbVar;
            return;
        }
        bsbVar.i.l = true;
        bsbVar.k();
        bsbVar.c = msbVar;
    }
}
