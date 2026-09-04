package dd;
public enum c0 extends b2 {
    public c0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.e();
            lVar.h.append(aVar.i());
            lVar.h("<" + aVar.i());
            lVar.a(b2.Q);
        } else if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.O);
        } else {
            lVar.f('<');
            lVar.f6778c = b2.K;
        }
    }
}
