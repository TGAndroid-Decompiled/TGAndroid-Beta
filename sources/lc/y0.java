package lc;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f16832n;
        char d = aVar.d();
        a1 a1Var = b2.f16780f0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f16770a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f16807c.append(d);
                        lVar.f16823c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f16823c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f16823c = wVar;
                return;
            }
            lVar.f16823c = b2.f16778e0;
            return;
        }
        lVar.m(this);
        eVar.f16807c.append((char) 65533);
        lVar.f16823c = a1Var;
    }
}
