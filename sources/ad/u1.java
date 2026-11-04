package ad;
public enum u1 extends c2 {
    public u1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                x xVar = c2.f317a;
                if (d != '>') {
                    if (d != 65535) {
                        gVar.f356e.append(d);
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
            mVar.f370c = c2.C0;
            return;
        }
        mVar.m(this);
        gVar.f356e.append((char) 65533);
    }
}
