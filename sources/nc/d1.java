package nc;
public enum d1 extends b2 {
    public d1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int[] c3 = lVar.c(null, false);
        if (c3 == null) {
            lVar.f('&');
        } else {
            lVar.g(new String(c3, 0, c3.length));
        }
        lVar.f17290c = b2.f17241c;
    }
}
