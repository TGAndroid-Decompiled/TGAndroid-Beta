package ed;
public enum t1 extends b2 {
    public t1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8893m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                w wVar = b2.f8832a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f8871e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8885c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8885c = wVar;
                return;
            }
            lVar.f8885c = b2.B0;
            return;
        }
        lVar.m(this);
        fVar.f8871e.append((char) 65533);
    }
}
