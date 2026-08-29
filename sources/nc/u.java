package nc;
public enum u extends b2 {
    public u() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.d(false);
            lVar.f17290c = b2.D;
            return;
        }
        lVar.g("</");
        lVar.f17290c = b2.f17246f;
    }
}
