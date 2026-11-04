package ad;
public enum z extends c2 {
    public z() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.m('-')) {
            mVar.f('-');
            mVar.a(c2.N);
            return;
        }
        mVar.f370c = c2.f326f;
    }
}
