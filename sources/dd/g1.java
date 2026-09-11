package dd;
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6786m;
        boolean o9 = aVar.o();
        h1 h1Var = b2.f6746p0;
        if (o9) {
            fVar.f();
            lVar.f6778c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.f();
                        fVar.f6764c.append(d);
                        lVar.f6778c = h1Var;
                        return;
                    }
                    return;
                }
                lVar.l(this);
                fVar.f();
                fVar.getClass();
                lVar.j();
                lVar.f6778c = b2.f6726a;
                return;
            }
            return;
        }
        lVar.m(this);
        fVar.f();
        fVar.f6764c.append((char) 65533);
        lVar.f6778c = h1Var;
    }
}
