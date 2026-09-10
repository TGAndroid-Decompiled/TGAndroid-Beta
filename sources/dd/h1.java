package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6477m;
        if (aVar.o()) {
            fVar.f6457c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f6420a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f6457c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f6470c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f6470c = wVar;
                    return;
                }
            }
            lVar.f6470c = b2.f6440q0;
            return;
        }
        lVar.m(this);
        fVar.f6457c.append((char) 65533);
    }
}
