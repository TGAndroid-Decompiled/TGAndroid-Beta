package ad;
public enum v1 extends c2 {
    public v1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            x xVar = c2.f317a;
            if (d != '>') {
                if (d != 65535) {
                    mVar.m(this);
                    mVar.f370c = c2.D0;
                    return;
                }
                mVar.l(this);
                mVar.f378m.getClass();
                mVar.j();
                mVar.f370c = xVar;
                return;
            }
            mVar.j();
            mVar.f370c = xVar;
        }
    }
}
