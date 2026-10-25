package gd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12466m;
        if (aVar.o()) {
            fVar.f12448c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f12411a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f12448c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f12459c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f12459c = vVar;
                    return;
                }
            }
            kVar.f12459c = a2.f12431q0;
            return;
        }
        kVar.m(this);
        fVar.f12448c.append((char) 65533);
    }
}
