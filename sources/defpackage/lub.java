package defpackage;
public enum lub extends rub {
    public lub() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char d = hl1Var.d();
        msb msbVar = rub.a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            bsbVar.j();
            bsbVar.c = msbVar;
            return;
        }
        bsbVar.j();
        bsbVar.c = msbVar;
    }
}
