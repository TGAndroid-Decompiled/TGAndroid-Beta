package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8667n;
        char d = aVar.d();
        a1 a1Var = b2.f8619j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8605a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8642c.append(d);
                        lVar.f8658c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8658c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8658c = wVar;
                return;
            }
            lVar.f8658c = b2.f8618i0;
            return;
        }
        lVar.m(this);
        eVar.f8642c.append((char) 65533);
        lVar.f8658c = a1Var;
    }
}
