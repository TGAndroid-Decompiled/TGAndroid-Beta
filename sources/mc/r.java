package mc;

public final enum r extends b2 {
    public r() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f18007c = b2.A;
        } else {
            lVar.g("</");
            lVar.f18007c = b2.f17961e;
        }
    }
}
