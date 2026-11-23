package dd;
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f8360i;
            char i7 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i7));
            lVar.h.append(aVar.i());
            lVar.a(b2.f8334x);
            return;
        }
        lVar.h("</");
        lVar.f8356c = b2.f8307c;
    }
}
