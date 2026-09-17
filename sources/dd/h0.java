package dd;
public enum h0 extends b2 {
    public h0() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int[] c10 = lVar.c(null, false);
        if (c10 == null) {
            lVar.f('&');
        } else {
            lVar.h(new String(c10, 0, c10.length));
        }
        lVar.f6778c = b2.f6726a;
    }
}
