package mc;

public final enum y extends b2 {
    public y() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (!aVar.m('-')) {
            lVar.f18007c = b2.f17963f;
        } else {
            lVar.f('-');
            lVar.a(b2.I);
        }
    }
}
