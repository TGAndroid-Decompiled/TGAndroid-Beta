package dd;
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f6782i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.n(String.valueOf(i10));
            lVar.h.append(aVar.i());
            lVar.a(b2.P);
            return;
        }
        lVar.h("</");
        lVar.f6778c = b2.K;
    }
}
