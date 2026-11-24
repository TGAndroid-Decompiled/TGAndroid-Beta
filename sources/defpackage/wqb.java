package defpackage;
public enum wqb extends qsb {
    public wqb() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        int[] c = aqbVar.c(null, false);
        if (c == null) {
            aqbVar.f('&');
        } else {
            aqbVar.h(new String(c, 0, c.length));
        }
        aqbVar.c = qsb.a;
    }
}
