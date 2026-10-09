package ed;
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
        lVar.f8886c = b2.f8842f;
    }
}
