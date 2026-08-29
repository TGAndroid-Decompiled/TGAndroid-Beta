package nc;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f17299n;
        char d = aVar.d();
        a1 a1Var = b2.f17247f0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f17237a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f17274c.append(d);
                        lVar.f17290c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f17290c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f17290c = wVar;
                return;
            }
            lVar.f17290c = b2.f17245e0;
            return;
        }
        lVar.m(this);
        eVar.f17274c.append((char) 65533);
        lVar.f17290c = a1Var;
    }
}
