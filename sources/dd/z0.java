package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7701n;
        char d = aVar.d();
        a1 a1Var = b2.f7656j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7643a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7679c.append(d);
                        lVar.f7693c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7693c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7693c = wVar;
                return;
            }
            lVar.f7693c = b2.f7655i0;
            return;
        }
        lVar.m(this);
        eVar.f7679c.append((char) 65533);
        lVar.f7693c = a1Var;
    }
}
