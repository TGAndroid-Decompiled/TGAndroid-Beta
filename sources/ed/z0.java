package ed;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8895n;
        char d = aVar.d();
        a1 a1Var = b2.f8847j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8833a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8870c.append(d);
                        lVar.f8886c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8886c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8886c = wVar;
                return;
            }
            lVar.f8886c = b2.f8846i0;
            return;
        }
        lVar.m(this);
        eVar.f8870c.append((char) 65533);
        lVar.f8886c = a1Var;
    }
}
