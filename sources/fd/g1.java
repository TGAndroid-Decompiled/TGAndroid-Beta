package fd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10591m;
        if (aVar.o()) {
            fVar.f10573c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f10536a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f10573c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10584c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f10584c = vVar;
                    return;
                }
            }
            kVar.f10584c = a2.f10556q0;
            return;
        }
        kVar.m(this);
        fVar.f10573c.append((char) 65533);
    }
}
