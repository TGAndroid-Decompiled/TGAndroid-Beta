package mc;

public final enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.g("</");
            lVar.f18007c = b2.f17958c;
            return;
        }
        lVar.d(false);
        j jVar = lVar.f18011i;
        char cI = aVar.i();
        jVar.getClass();
        jVar.i(String.valueOf(cI));
        lVar.h.append(aVar.i());
        lVar.a(b2.f17983w);
    }
}
