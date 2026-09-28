package dd;
public enum q1 extends b2 {
    public q1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7688m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f7631a;
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
                        lVar.f7681c = wVar;
                        return;
                    }
                    lVar.m(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f7681c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f7681c = b2.A0;
                return;
            }
            lVar.m(this);
            lVar.f7681c = b2.f7665z0;
            return;
        }
        lVar.f7681c = b2.f7664y0;
    }
}
