package fd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10576m;
        if (aVar.o()) {
            fVar.f10558c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f10521a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f10558c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10569c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f10569c = vVar;
                    return;
                }
            }
            kVar.f10569c = a2.f10541q0;
            return;
        }
        kVar.m(this);
        fVar.f10558c.append((char) 65533);
    }
}
