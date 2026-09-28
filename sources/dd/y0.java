package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f7689n;
        char d = aVar.d();
        a1 a1Var = b2.f7644j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7631a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f7667c.append(d);
                        lVar.f7681c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f7681c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f7681c = wVar;
                return;
            }
            lVar.f7681c = b2.f7643i0;
            return;
        }
        lVar.m(this);
        eVar.f7667c.append((char) 65533);
        lVar.f7681c = a1Var;
    }
}
