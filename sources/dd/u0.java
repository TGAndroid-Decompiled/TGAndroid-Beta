package dd;
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
                w wVar = b2.f7632a;
                if (d != '>') {
                    if (d != 65535) {
                        lVar.m(this);
                        aVar.q();
                        lVar.f7682c = m0Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.f7682c = wVar;
                    return;
                }
                lVar.k();
                lVar.f7682c = wVar;
                return;
            }
            lVar.f7682c = b2.f7639e0;
            return;
        }
        lVar.f7682c = m0Var;
    }
}
