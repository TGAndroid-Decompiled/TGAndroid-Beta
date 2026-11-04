package ad;
public enum r1 extends c2 {
    public r1() {
        super("AfterDoctypeSystemKeyword", 60);
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
                            mVar.j();
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
                mVar.m(this);
                mVar.f370c = c2.B0;
                return;
            }
            mVar.m(this);
            mVar.f370c = c2.A0;
            return;
        }
        mVar.f370c = c2.f352z0;
    }
}
