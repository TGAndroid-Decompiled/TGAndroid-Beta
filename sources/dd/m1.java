package dd;
public enum m1 extends b2 {
    public m1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8661m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                w wVar = b2.f8600a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8653c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8653c = wVar;
                return;
            }
            lVar.f8653c = b2.f8628v0;
            return;
        }
        lVar.m(this);
        fVar.d.append((char) 65533);
    }
}
