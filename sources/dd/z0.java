package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8333n;
        char d = aVar.d();
        a1 a1Var = b2.f8286k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8271a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8308c.append(d);
                        lVar.f8324c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8324c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8324c = wVar;
                return;
            }
            lVar.f8324c = b2.f8285j0;
            return;
        }
        lVar.m(this);
        eVar.f8308c.append((char) 65533);
        lVar.f8324c = a1Var;
    }
}
