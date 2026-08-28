package lc;
public enum d1 extends b2 {
    public d1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int[] c10 = lVar.c(null, false);
        if (c10 == null) {
            lVar.f('&');
        } else {
            lVar.g(new String(c10, 0, c10.length));
        }
        lVar.f16823c = b2.f16774c;
    }
}
