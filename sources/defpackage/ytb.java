package defpackage;
public enum ytb extends rub {
    public ytb() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        boolean j = hl1Var.j();
        msb msbVar = rub.a;
        if (j) {
            bsbVar.l(this);
            bsbVar.j();
            bsbVar.c = msbVar;
        } else if (hl1Var.n('\t', '\n', '\r', '\f', ' ')) {
            hl1Var.a();
        } else if (hl1Var.m('>')) {
            bsbVar.j();
            bsbVar.a(msbVar);
        } else if (hl1Var.l("PUBLIC")) {
            bsbVar.c = rub.s0;
        } else if (hl1Var.l("SYSTEM")) {
            bsbVar.c = rub.y0;
        } else {
            bsbVar.m(this);
            bsbVar.a(rub.D0);
        }
    }
}
