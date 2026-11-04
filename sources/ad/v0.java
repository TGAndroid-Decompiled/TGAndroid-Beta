package ad;
public enum v0 extends c2 {
    public v0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        n0 n0Var = c2.X;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                x xVar = c2.f317a;
                if (d != '>') {
                    if (d != 65535) {
                        mVar.m(this);
                        aVar.q();
                        mVar.f370c = n0Var;
                        return;
                    }
                    mVar.l(this);
                    mVar.f370c = xVar;
                    return;
                }
                mVar.k();
                mVar.f370c = xVar;
                return;
            }
            mVar.f370c = c2.f327f0;
            return;
        }
        mVar.f370c = n0Var;
    }
}
