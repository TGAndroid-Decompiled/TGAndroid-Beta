package ad;
public enum h1 extends c2 {
    public h1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        boolean o10 = aVar.o();
        i1 i1Var = c2.f338q0;
        if (o10) {
            gVar.b();
            mVar.f370c = i1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        gVar.b();
                        gVar.f355c.append(d);
                        mVar.f370c = i1Var;
                        return;
                    }
                    return;
                }
                mVar.l(this);
                gVar.b();
                gVar.getClass();
                mVar.j();
                mVar.f370c = c2.f317a;
                return;
            }
            return;
        }
        mVar.m(this);
        gVar.b();
        gVar.f355c.append((char) 65533);
        mVar.f370c = i1Var;
    }
}
