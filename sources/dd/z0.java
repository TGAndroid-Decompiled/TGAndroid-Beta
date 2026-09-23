package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7690n;
        char d = aVar.d();
        a1 a1Var = b2.f7645j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7632a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7668c.append(d);
                        lVar.f7682c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7682c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7682c = wVar;
                return;
            }
            lVar.f7682c = b2.f7644i0;
            return;
        }
        lVar.m(this);
        eVar.f7668c.append((char) 65533);
        lVar.f7682c = a1Var;
    }
}
