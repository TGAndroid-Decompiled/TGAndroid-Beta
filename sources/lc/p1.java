package lc;
public enum p1 extends b2 {
    public p1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f16831m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    w wVar = b2.f16770a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            fVar.getClass();
                            lVar.f16823c = b2.f16804y0;
                            return;
                        }
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f16823c = wVar;
                        return;
                    }
                    lVar.j();
                    lVar.f16823c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.f16823c = b2.f16800w0;
                return;
            }
            lVar.m(this);
            lVar.f16823c = b2.f16798v0;
        }
    }
}
