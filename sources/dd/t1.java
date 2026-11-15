package dd;
public enum t1 extends b2 {
    public t1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
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
                        fVar.f8031e.append(d);
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
            lVar.f8045c = b2.C0;
            return;
        }
        lVar.m(this);
        fVar.f8031e.append((char) 65533);
    }
}
