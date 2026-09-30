package dd;
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7700m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f7643a;
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
                        lVar.f7693c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f7693c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f7693c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f7693c = b2.f7677z0;
            return;
        }
        lVar.f7693c = b2.f7676y0;
    }
}
