package ad;
public enum v extends c2 {
    public v() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.d(false);
            mVar.f370c = c2.I;
            return;
        }
        mVar.h("</");
        mVar.f370c = c2.f326f;
    }
}
