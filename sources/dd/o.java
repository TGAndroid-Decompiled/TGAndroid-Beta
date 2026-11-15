package dd;
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            j jVar = lVar.f8049i;
            char i7 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i7));
            lVar.h.append(aVar.i());
            lVar.a(b2.f8023x);
            return;
        }
        lVar.h("</");
        lVar.f8045c = b2.f7996c;
    }
}
