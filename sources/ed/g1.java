package ed;
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8891m;
        boolean o9 = aVar.o();
        h1 h1Var = b2.f8850p0;
        if (o9) {
            fVar.b();
            lVar.f8883c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.b();
                        fVar.f8868c.append(d);
                        lVar.f8883c = h1Var;
                        return;
                    }
                    return;
                }
                lVar.l(this);
                fVar.b();
                fVar.getClass();
                lVar.j();
                lVar.f8883c = b2.f8830a;
                return;
            }
            return;
        }
        lVar.m(this);
        fVar.b();
        fVar.f8868c.append((char) 65533);
        lVar.f8883c = h1Var;
    }
}
