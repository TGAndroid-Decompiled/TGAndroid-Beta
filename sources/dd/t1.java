package dd;
public enum t1 extends b2 {
    public t1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8335m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                w wVar = b2.f8274a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f8313e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8327c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8327c = wVar;
                return;
            }
            lVar.f8327c = b2.C0;
            return;
        }
        lVar.m(this);
        fVar.f8313e.append((char) 65533);
    }
}
