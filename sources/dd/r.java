package dd;
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f8042c = b2.F;
            return;
        }
        lVar.h("</");
        lVar.f8042c = b2.f7996e;
    }
}
