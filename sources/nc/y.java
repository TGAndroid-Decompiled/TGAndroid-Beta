package nc;
public enum y extends b2 {
    public y() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.m('-')) {
            lVar.f('-');
            lVar.a(b2.I);
            return;
        }
        lVar.f17290c = b2.f17246f;
    }
}
