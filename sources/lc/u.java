package lc;
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f16823c = b2.D;
            return;
        }
        lVar.g("</");
        lVar.f16823c = b2.f16779f;
    }
}
