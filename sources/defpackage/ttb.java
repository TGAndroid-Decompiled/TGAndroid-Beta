package defpackage;
public enum ttb extends rub {
    public ttb() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        int[] c = bsbVar.c(null, false);
        if (c == null) {
            bsbVar.f('&');
        } else {
            bsbVar.h(new String(c, 0, c.length));
        }
        bsbVar.c = rub.c;
    }
}
