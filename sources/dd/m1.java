package dd;
public enum m1 extends b2 {
    public m1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
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
                        fVar.d.append(d);
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
            lVar.f8327c = b2.f8304w0;
            return;
        }
        lVar.m(this);
        fVar.d.append((char) 65533);
    }
}
