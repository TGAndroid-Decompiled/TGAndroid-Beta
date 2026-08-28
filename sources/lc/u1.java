package lc;
public enum u1 extends b2 {
    public u1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            w wVar = b2.f16770a;
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f16823c = b2.f16804y0;
                    return;
                }
                lVar.l(this);
                lVar.f16831m.getClass();
                lVar.j();
                lVar.f16823c = wVar;
                return;
            }
            lVar.j();
            lVar.f16823c = wVar;
        }
    }
}
