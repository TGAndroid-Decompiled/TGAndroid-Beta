package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8317n;
        char d = aVar.d();
        a1 a1Var = b2.f8269j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8255a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8292c.append(d);
                        lVar.f8308c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8308c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8308c = wVar;
                return;
            }
            lVar.f8308c = b2.f8268i0;
            return;
        }
        lVar.m(this);
        eVar.f8292c.append((char) 65533);
        lVar.f8308c = a1Var;
    }
}
