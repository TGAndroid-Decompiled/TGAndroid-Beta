package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6478n;
        char d = aVar.d();
        a1 a1Var = b2.f6433j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f6420a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f6456c.append(d);
                        lVar.f6470c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f6470c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f6470c = wVar;
                return;
            }
            lVar.f6470c = b2.f6432i0;
            return;
        }
        lVar.m(this);
        eVar.f6456c.append((char) 65533);
        lVar.f6470c = a1Var;
    }
}
