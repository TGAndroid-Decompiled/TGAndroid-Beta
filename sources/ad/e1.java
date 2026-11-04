package ad;
public enum e1 extends c2 {
    public e1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void d(m mVar, a aVar) {
        int[] c2 = mVar.c(null, false);
        if (c2 == null) {
            mVar.f('&');
        } else {
            mVar.h(new String(c2, 0, c2.length));
        }
        mVar.f370c = c2.f321c;
    }
}
