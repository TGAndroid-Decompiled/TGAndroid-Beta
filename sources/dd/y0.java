package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8662n;
        char d = aVar.d();
        a1 a1Var = b2.f8614j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8600a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8637c.append(d);
                        lVar.f8653c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8653c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8653c = wVar;
                return;
            }
            lVar.f8653c = b2.f8613i0;
            return;
        }
        lVar.m(this);
        eVar.f8637c.append((char) 65533);
        lVar.f8653c = a1Var;
    }
}
