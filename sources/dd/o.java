package dd;
public enum o extends b2 {
    public o() {
        super("RCDATAEndTagOpen", 11);
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
            lVar.a(b2.f8633x);
            return;
        }
        lVar.h("</");
        lVar.f8655c = b2.f8606c;
    }
}
