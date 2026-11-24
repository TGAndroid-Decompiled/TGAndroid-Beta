package defpackage;
public enum ksb extends qsb {
    public ksb() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        lqb lqbVar = qsb.a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            aqbVar.j();
            aqbVar.c = lqbVar;
            return;
        }
        aqbVar.j();
        aqbVar.c = lqbVar;
    }
}
