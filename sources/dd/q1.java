package dd;
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8316m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f8255a;
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
                        lVar.f8308c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8308c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f8308c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f8308c = b2.f8290z0;
            return;
        }
        lVar.f8308c = b2.f8289y0;
    }
}
