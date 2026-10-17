package fd;
public enum q extends a2 {
    public q() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.f10568c = a2.E;
            return;
        }
        kVar.h("</");
        kVar.f10568c = a2.e;
    }
}
