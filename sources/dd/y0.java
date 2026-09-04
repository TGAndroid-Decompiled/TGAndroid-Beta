package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f6787n;
        char d = aVar.d();
        a1 a1Var = b2.f6740j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f6726a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f6763c.append(d);
                        lVar.f6778c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f6778c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f6778c = wVar;
                return;
            }
            lVar.f6778c = b2.f6739i0;
            return;
        }
        lVar.m(this);
        eVar.f6763c.append((char) 65533);
        lVar.f6778c = a1Var;
    }
}
