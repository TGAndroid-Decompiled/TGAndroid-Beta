package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7707n;
        char d = aVar.d();
        a1 a1Var = b2.f7662j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7649a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7685c.append(d);
                        lVar.f7699c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7699c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7699c = wVar;
                return;
            }
            lVar.f7699c = b2.f7661i0;
            return;
        }
        lVar.m(this);
        eVar.f7685c.append((char) 65533);
        lVar.f7699c = a1Var;
    }
}
