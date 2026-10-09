package ed;
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f8886c = b2.E;
            return;
        }
        lVar.h("</");
        lVar.f8886c = b2.f8840e;
    }
}
