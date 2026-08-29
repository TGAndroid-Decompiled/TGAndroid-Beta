package nc;
public enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f17290c = b2.A;
            return;
        }
        lVar.g("</");
        lVar.f17290c = b2.f17244e;
    }
}
