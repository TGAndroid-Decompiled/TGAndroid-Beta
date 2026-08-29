package nc;
public enum r1 extends b2 {
    public r1() {
        super("BeforeDoctypeSystemIdentifier", 61);
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
                            lVar.f17290c = b2.f17271y0;
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
                lVar.f17290c = b2.f17267w0;
                return;
            }
            lVar.f17290c = b2.f17265v0;
        }
    }
}
