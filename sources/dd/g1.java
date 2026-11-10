package dd;
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8666m;
        boolean o4 = aVar.o();
        h1 h1Var = b2.f8625p0;
        if (o4) {
            fVar.b();
            lVar.f8658c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.b();
                        fVar.f8643c.append(d);
                        lVar.f8658c = h1Var;
                        return;
                    }
                    return;
                }
                lVar.l(this);
                fVar.b();
                fVar.getClass();
                lVar.j();
                lVar.f8658c = b2.f8605a;
                return;
            }
            return;
        }
        lVar.m(this);
        fVar.b();
        fVar.f8643c.append((char) 65533);
        lVar.f8658c = h1Var;
    }
}
