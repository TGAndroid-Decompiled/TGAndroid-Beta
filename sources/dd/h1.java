package dd;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8326m;
        if (aVar.o()) {
            fVar.f8303c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f8265a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f8303c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f8318c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f8318c = wVar;
                    return;
                }
            }
            lVar.f8318c = b2.f8288r0;
            return;
        }
        lVar.m(this);
        fVar.f8303c.append((char) 65533);
    }
}
