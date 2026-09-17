package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6786m;
        if (aVar.o()) {
            fVar.f6764c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f6726a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f6764c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f6778c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f6778c = wVar;
                    return;
                }
            }
            lVar.f6778c = b2.f6747q0;
            return;
        }
        lVar.m(this);
        fVar.f6764c.append((char) 65533);
    }
}
