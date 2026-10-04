package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8315m;
        if (aVar.o()) {
            fVar.f8292c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f8254a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f8292c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8307c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f8307c = wVar;
                    return;
                }
            }
            lVar.f8307c = b2.f8275q0;
            return;
        }
        lVar.m(this);
        fVar.f8292c.append((char) 65533);
    }
}
