package mc;

public final enum d1 extends b2 {
    public d1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int[] iArrC = lVar.c(null, false);
        if (iArrC == null) {
            lVar.f('&');
        } else {
            lVar.g(new String(iArrC, 0, iArrC.length));
        }
        lVar.f18007c = b2.f17958c;
    }
}
