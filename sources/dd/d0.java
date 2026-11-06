package dd;
public enum d0 extends b2 {
    public d0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f8659i;
            char i7 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i7));
            lVar.h.append(aVar.i());
            lVar.a(b2.P);
            return;
        }
        lVar.h("</");
        lVar.f8655c = b2.K;
    }
}
