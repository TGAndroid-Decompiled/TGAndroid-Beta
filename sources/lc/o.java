package lc;
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f16827i;
            char i9 = aVar.i();
            jVar.getClass();
            jVar.i(String.valueOf(i9));
            lVar.h.append(aVar.i());
            lVar.a(b2.f16799w);
            return;
        }
        lVar.g("</");
        lVar.f16823c = b2.f16774c;
    }
}
