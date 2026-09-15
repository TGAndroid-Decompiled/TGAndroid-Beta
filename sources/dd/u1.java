package dd;
public enum u1 extends b2 {
    public u1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            w wVar = b2.f7644a;
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f7694c = b2.C0;
                    return;
                }
                lVar.l(this);
                lVar.f7701m.getClass();
                lVar.j();
                lVar.f7694c = wVar;
                return;
            }
            lVar.j();
            lVar.f7694c = wVar;
        }
    }
}
