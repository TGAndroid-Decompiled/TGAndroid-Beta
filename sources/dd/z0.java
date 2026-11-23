package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8365n;
        char d = aVar.d();
        a1 a1Var = b2.f8318k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8303a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8340c.append(d);
                        lVar.f8356c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8356c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8356c = wVar;
                return;
            }
            lVar.f8356c = b2.f8317j0;
            return;
        }
        lVar.m(this);
        eVar.f8340c.append((char) 65533);
        lVar.f8356c = a1Var;
    }
}
