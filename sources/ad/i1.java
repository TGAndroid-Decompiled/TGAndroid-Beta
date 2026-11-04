package ad;
public enum i1 extends c2 {
    public i1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        if (aVar.o()) {
            gVar.f355c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                x xVar = c2.f317a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            gVar.f355c.append(d);
                            return;
                        }
                    } else {
                        mVar.l(this);
                        gVar.getClass();
                        mVar.j();
                        mVar.f370c = xVar;
                        return;
                    }
                } else {
                    mVar.j();
                    mVar.f370c = xVar;
                    return;
                }
            }
            mVar.f370c = c2.f340r0;
            return;
        }
        mVar.m(this);
        gVar.f355c.append((char) 65533);
    }
}
