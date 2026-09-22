package dd;
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f7699i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i10));
            lVar.h.append(aVar.i());
            lVar.a(b2.f7674w);
            return;
        }
        lVar.h("</");
        lVar.f7696c = b2.f7650c;
    }
}
