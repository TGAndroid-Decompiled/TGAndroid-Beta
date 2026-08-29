package nc;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        if (aVar.o()) {
            fVar.f17275c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f17237a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f17275c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f17290c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f17290c = wVar;
                    return;
                }
            }
            lVar.f17290c = b2.m0;
            return;
        }
        lVar.m(this);
        fVar.f17275c.append((char) 65533);
    }
}
