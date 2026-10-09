package ed;
public enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = b2.W;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                w wVar = b2.f8833a;
                if (d != '>') {
                    if (d != 65535) {
                        lVar.m(this);
                        aVar.q();
                        lVar.f8886c = m0Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.f8886c = wVar;
                    return;
                }
                lVar.k();
                lVar.f8886c = wVar;
                return;
            }
            lVar.f8886c = b2.f8841e0;
            return;
        }
        lVar.f8886c = m0Var;
    }
}
