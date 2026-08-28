package lc;
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f16831m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f16770a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f16809e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f16823c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f16823c = wVar;
                return;
            }
            lVar.f16823c = b2.f16802x0;
            return;
        }
        lVar.m(this);
        fVar.f16809e.append((char) 65533);
    }
}
