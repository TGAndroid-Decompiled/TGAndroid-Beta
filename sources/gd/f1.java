package gd;
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12466m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.f12430p0;
        if (o10) {
            fVar.b();
            kVar.f12459c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.b();
                        fVar.f12448c.append(d);
                        kVar.f12459c = g1Var;
                        return;
                    }
                    return;
                }
                kVar.l(this);
                fVar.b();
                fVar.getClass();
                kVar.j();
                kVar.f12459c = a2.f12411a;
                return;
            }
            return;
        }
        kVar.m(this);
        fVar.b();
        fVar.f12448c.append((char) 65533);
        kVar.f12459c = g1Var;
    }
}
