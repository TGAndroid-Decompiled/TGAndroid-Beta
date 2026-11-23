package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8328n;
        char d = aVar.d();
        a1 a1Var = b2.f8281k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8266a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8303c.append(d);
                        lVar.f8319c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8319c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8319c = wVar;
                return;
            }
            lVar.f8319c = b2.f8280j0;
            return;
        }
        lVar.m(this);
        eVar.f8303c.append((char) 65533);
        lVar.f8319c = a1Var;
    }
}
