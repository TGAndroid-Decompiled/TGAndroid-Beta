package ad;
public enum m1 extends c2 {
    public m1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                x xVar = c2.f317a;
                if (d != '>') {
                    if (d != 65535) {
                        gVar.d.append(d);
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
            mVar.f370c = c2.f347w0;
            return;
        }
        mVar.m(this);
        gVar.d.append((char) 65533);
    }
}
