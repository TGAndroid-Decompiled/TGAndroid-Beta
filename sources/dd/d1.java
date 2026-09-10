package dd;
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
            lVar.h(new String(c10, 0, c10.length));
        }
        lVar.f6470c = b2.f6424c;
    }
}
