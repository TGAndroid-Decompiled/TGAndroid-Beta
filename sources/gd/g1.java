package gd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12465m;
        if (aVar.o()) {
            fVar.f12447c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f12410a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f12447c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f12458c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f12458c = vVar;
                    return;
                }
            }
            kVar.f12458c = a2.f12430q0;
            return;
        }
        kVar.m(this);
        fVar.f12447c.append((char) 65533);
    }
}
