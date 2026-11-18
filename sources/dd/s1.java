package dd;
public enum s1 extends b2 {
    public s1() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8332m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f8271a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f8310e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8324c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8324c = wVar;
                return;
            }
            lVar.f8324c = b2.C0;
            return;
        }
        lVar.m(this);
        fVar.f8310e.append((char) 65533);
    }
}
