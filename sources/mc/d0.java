package mc;

public final enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (!aVar.o()) {
            lVar.g("</");
            lVar.f18007c = b2.G;
            return;
        }
        lVar.d(false);
        j jVar = lVar.f18011i;
        char cI = aVar.i();
        jVar.getClass();
        jVar.i(String.valueOf(cI));
        lVar.h.append(aVar.i());
        lVar.a(b2.L);
    }
}
