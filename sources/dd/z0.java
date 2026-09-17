package dd;
public enum z0 extends b2 {
    public z0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6815n;
        char d = aVar.d();
        a1 a1Var = b2.f6767j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f6753a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f6790c.append(d);
                        lVar.f6806c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f6806c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f6806c = wVar;
                return;
            }
            lVar.f6806c = b2.f6766i0;
            return;
        }
        lVar.m(this);
        eVar.f6790c.append((char) 65533);
        lVar.f6806c = a1Var;
    }
}
