package nc;
public enum u0 extends b2 {
    public u0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = b2.S;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                w wVar = b2.f17237a;
                if (d != '>') {
                    if (d != 65535) {
                        lVar.m(this);
                        aVar.q();
                        lVar.f17290c = m0Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.f17290c = wVar;
                    return;
                }
                lVar.k();
                lVar.f17290c = wVar;
                return;
            }
            lVar.f17290c = b2.f17238a0;
            return;
        }
        lVar.f17290c = m0Var;
    }
}
