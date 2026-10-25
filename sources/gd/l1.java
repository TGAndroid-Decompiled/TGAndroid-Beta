package gd;
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12466m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                v vVar = a2.f12411a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f12459c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f12459c = vVar;
                return;
            }
            kVar.f12459c = a2.f12438v0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
