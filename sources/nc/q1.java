package nc;
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f17237a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.j();
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f17290c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f17290c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f17290c = b2.f17267w0;
                return;
            }
            lVar.m(this);
            lVar.f17290c = b2.f17265v0;
            return;
        }
        lVar.f17290c = b2.f17264u0;
    }
}
