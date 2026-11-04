package ad;
public enum s1 extends c2 {
    public s1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    x xVar = c2.f317a;
                    if (d != '>') {
                        if (d != 65535) {
                            mVar.m(this);
                            gVar.getClass();
                            mVar.f370c = c2.D0;
                            return;
                        }
                        mVar.l(this);
                        gVar.getClass();
                        mVar.j();
                        mVar.f370c = xVar;
                        return;
                    }
                    mVar.m(this);
                    gVar.getClass();
                    mVar.j();
                    mVar.f370c = xVar;
                    return;
                }
                mVar.f370c = c2.B0;
                return;
            }
            mVar.f370c = c2.A0;
        }
    }
}
