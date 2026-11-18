package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8336n;
        char d = aVar.d();
        a1 a1Var = b2.f8289k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8274a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8311c.append(d);
                        lVar.f8327c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8327c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8327c = wVar;
                return;
            }
            lVar.f8327c = b2.f8288j0;
            return;
        }
        lVar.m(this);
        eVar.f8311c.append((char) 65533);
        lVar.f8327c = a1Var;
    }
}
