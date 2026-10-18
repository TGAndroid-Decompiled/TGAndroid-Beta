package fd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10577m;
        if (aVar.o()) {
            fVar.f10559c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f10522a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f10559c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10570c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f10570c = vVar;
                    return;
                }
            }
            kVar.f10570c = a2.f10542q0;
            return;
        }
        kVar.m(this);
        fVar.f10559c.append((char) 65533);
    }
}
