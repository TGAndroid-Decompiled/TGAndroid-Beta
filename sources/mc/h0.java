package mc;

public final enum h0 extends b2 {
    public h0() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int[] iArrC = lVar.c(null, false);
        if (iArrC == null) {
            lVar.f('&');
        } else {
            lVar.g(new String(iArrC, 0, iArrC.length));
        }
        lVar.f18007c = b2.f17954a;
    }
}
