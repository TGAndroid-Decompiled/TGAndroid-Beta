package dd;
public enum r1 extends b2 {
    public r1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6786m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f6726a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f6778c = b2.C0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f6778c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f6778c = wVar;
                    return;
                }
                lVar.f6778c = b2.A0;
                return;
            }
            lVar.f6778c = b2.f6761z0;
        }
    }
}
