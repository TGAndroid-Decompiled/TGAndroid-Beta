package mc;

public final enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f18007c = b2.D;
        } else {
            lVar.g("</");
            lVar.f18007c = b2.f17963f;
        }
    }
}
