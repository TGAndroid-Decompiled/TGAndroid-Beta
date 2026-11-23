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
            lVar.a(b2.R);
        } else if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.P);
        } else {
            lVar.f('<');
            lVar.f8319c = b2.L;
        }
    }
}
