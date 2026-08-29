package nc;
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f17294i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.i(String.valueOf(i10));
            lVar.h.append(aVar.i());
            lVar.a(b2.L);
            return;
        }
        lVar.g("</");
        lVar.f17290c = b2.G;
    }
}
