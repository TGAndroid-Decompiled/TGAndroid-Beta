package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7705m;
        if (aVar.o()) {
            fVar.f7685c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f7648a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f7685c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f7698c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f7698c = wVar;
                    return;
                }
            }
            lVar.f7698c = b2.f7668q0;
            return;
        }
        lVar.m(this);
        fVar.f7685c.append((char) 65533);
    }
}
