package ed;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8893m;
        if (aVar.o()) {
            fVar.f8870c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f8832a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f8870c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8885c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f8885c = wVar;
                    return;
                }
            }
            lVar.f8885c = b2.f8853q0;
            return;
        }
        lVar.m(this);
        fVar.f8870c.append((char) 65533);
    }
}
