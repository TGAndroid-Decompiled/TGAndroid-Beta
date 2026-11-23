package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8327n;
        char d = aVar.d();
        a1 a1Var = b2.f8280k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8265a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8302c.append(d);
                        lVar.f8318c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8318c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8318c = wVar;
                return;
            }
            lVar.f8318c = b2.f8279j0;
            return;
        }
        lVar.m(this);
        eVar.f8302c.append((char) 65533);
        lVar.f8318c = a1Var;
    }
}
