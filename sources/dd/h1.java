package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f7701m;
        if (aVar.o()) {
            fVar.f7681c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f7644a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f7681c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f7694c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f7694c = wVar;
                    return;
                }
            }
            lVar.f7694c = b2.f7664q0;
            return;
        }
        lVar.m(this);
        fVar.f7681c.append((char) 65533);
    }
}
