package dd;
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f8319c = b2.I;
            return;
        }
        lVar.h("</");
        lVar.f8319c = b2.f8275f;
    }
}
