package ed;
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8894m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f8833a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f8872e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8886c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8886c = wVar;
                return;
            }
            lVar.f8886c = b2.B0;
            return;
        }
        lVar.m(this);
        fVar.f8872e.append((char) 65533);
    }
}
