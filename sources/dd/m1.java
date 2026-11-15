package dd;
public enum m1 extends b2 {
    public m1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8053m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                w wVar = b2.f7992a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8045c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8045c = wVar;
                return;
            }
            lVar.f8045c = b2.f8022w0;
            return;
        }
        lVar.m(this);
        fVar.d.append((char) 65533);
    }
}
