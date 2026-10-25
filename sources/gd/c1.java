package gd;
public enum c1 extends a2 {
    public c1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override
    public final void d(k kVar, a aVar) {
        int[] c10 = kVar.c(null, false);
        if (c10 == null) {
            kVar.f('&');
        } else {
            kVar.h(new String(c10, 0, c10.length));
        }
        kVar.f12459c = a2.f12415c;
    }
}
