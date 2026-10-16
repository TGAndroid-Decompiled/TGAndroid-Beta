package fd;
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            j jVar = kVar.f9130i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i10));
            kVar.h.append(aVar.i());
            kVar.a(a2.f9107w);
            return;
        }
        kVar.h("</");
        kVar.f9127c = a2.f9083c;
    }
}
