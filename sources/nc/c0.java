package nc;
public enum c0 extends b2 {
    public c0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.o()) {
            lVar.e();
            lVar.h.append(aVar.i());
            lVar.g("<" + aVar.i());
            lVar.a(b2.M);
        } else if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.K);
        } else {
            lVar.f('<');
            lVar.f17290c = b2.G;
        }
    }
}
