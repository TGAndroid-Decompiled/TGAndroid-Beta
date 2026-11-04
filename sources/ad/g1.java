package ad;
public enum g1 extends c2 {
    public g1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        char d = aVar.d();
        h1 h1Var = c2.f337p0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    mVar.m(this);
                    mVar.f370c = h1Var;
                    return;
                }
                mVar.l(this);
            }
            mVar.m(this);
            gVar.b();
            gVar.getClass();
            mVar.j();
            mVar.f370c = c2.f317a;
            return;
        }
        mVar.f370c = h1Var;
    }
}
