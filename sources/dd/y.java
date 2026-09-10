package dd;
public enum y extends b2 {
    public y() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.m('-')) {
            lVar.f('-');
            lVar.a(b2.M);
            return;
        }
        lVar.f6470c = b2.f6428f;
    }
}
