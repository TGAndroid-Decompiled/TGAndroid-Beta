package dd;
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6814m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f6753a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f6792e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f6806c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f6806c = wVar;
                return;
            }
            lVar.f6806c = b2.B0;
            return;
        }
        lVar.m(this);
        fVar.f6792e.append((char) 65533);
    }
}
