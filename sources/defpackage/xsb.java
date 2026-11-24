package defpackage;
public enum xsb extends rub {
    public xsb() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        int[] c = bsbVar.c(null, false);
        if (c == null) {
            bsbVar.f('&');
        } else {
            bsbVar.h(new String(c, 0, c.length));
        }
        bsbVar.c = rub.a;
    }
}
