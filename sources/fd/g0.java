package fd;
public enum g0 extends a2 {
    public g0() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void d(k kVar, a aVar) {
        int[] c10 = kVar.c(null, false);
        if (c10 == null) {
            kVar.f('&');
        } else {
            kVar.h(new String(c10, 0, c10.length));
        }
        kVar.f10568c = a2.f10520a;
    }
}
