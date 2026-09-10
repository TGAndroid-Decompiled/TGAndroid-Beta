package dd;
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f6470c = b2.H;
            return;
        }
        lVar.h("</");
        lVar.f6470c = b2.f6428f;
    }
}
