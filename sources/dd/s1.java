package dd;
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7703m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f7646a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f7696c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f7696c = wVar;
                return;
            }
            lVar.f7696c = b2.B0;
            return;
        }
        lVar.m(this);
        fVar.e.append((char) 65533);
    }
}
