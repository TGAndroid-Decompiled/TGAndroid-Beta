package lc;
public enum h1 extends b2 {
    public h1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f16831m;
        if (aVar.o()) {
            fVar.f16808c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                w wVar = b2.f16770a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f16808c.append(d);
                            return;
                        }
                    } else {
                        lVar.l(this);
                        fVar.getClass();
                        lVar.j();
                        lVar.f16823c = wVar;
                        return;
                    }
                } else {
                    lVar.j();
                    lVar.f16823c = wVar;
                    return;
                }
            }
            lVar.f16823c = b2.m0;
            return;
        }
        lVar.m(this);
        fVar.f16808c.append((char) 65533);
    }
}
