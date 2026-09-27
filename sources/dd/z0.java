package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7691n;
        char d = aVar.d();
        a1 a1Var = b2.f7646j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7633a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7669c.append(d);
                        lVar.f7683c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7683c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7683c = wVar;
                return;
            }
            lVar.f7683c = b2.f7645i0;
            return;
        }
        lVar.m(this);
        eVar.f7669c.append((char) 65533);
        lVar.f7683c = a1Var;
    }
}
