package defpackage;
public enum tvb extends rwb {
    public tvb() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        int[] c = bubVar.c(null, false);
        if (c == null) {
            bubVar.f('&');
        } else {
            bubVar.h(new String(c, 0, c.length));
        }
        bubVar.c = rwb.c;
    }
}
