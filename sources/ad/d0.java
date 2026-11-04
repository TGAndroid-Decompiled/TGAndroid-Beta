package ad;
public enum d0 extends c2 {
    public d0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.e();
            mVar.h.append(aVar.i());
            mVar.h("<" + aVar.i());
            mVar.a(c2.R);
        } else if (aVar.m('/')) {
            mVar.e();
            mVar.a(c2.P);
        } else {
            mVar.f('<');
            mVar.f370c = c2.L;
        }
    }
}
