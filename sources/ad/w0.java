package ad;
public enum w0 extends c2 {
    public w0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        x xVar = c2.f317a;
        if (d != '>') {
            if (d != 65535) {
                mVar.m(this);
                aVar.q();
                mVar.f370c = c2.X;
                return;
            }
            mVar.l(this);
            mVar.f370c = xVar;
            return;
        }
        mVar.f374i.f362j = true;
        mVar.k();
        mVar.f370c = xVar;
    }
}
