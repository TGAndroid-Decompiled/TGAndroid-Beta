package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7704n;
        char d = aVar.d();
        a1 a1Var = b2.f7659j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7646a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7682c.append(d);
                        lVar.f7696c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7696c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7696c = wVar;
                return;
            }
            lVar.f7696c = b2.f7658i0;
            return;
        }
        lVar.m(this);
        eVar.f7682c.append((char) 65533);
        lVar.f7696c = a1Var;
    }
}
