package ed;
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f8885c = b2.H;
            return;
        }
        lVar.h("</");
        lVar.f8885c = b2.f8841f;
    }
}
