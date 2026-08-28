package lc;
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f16831m;
        boolean o6 = aVar.o();
        h1 h1Var = b2.f16786l0;
        if (o6) {
            fVar.c();
            lVar.f16823c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.c();
                        fVar.f16808c.append(d);
                        lVar.f16823c = h1Var;
                        return;
                    }
                    return;
                }
                lVar.l(this);
                fVar.c();
                fVar.getClass();
                lVar.j();
                lVar.f16823c = b2.f16770a;
                return;
            }
            return;
        }
        lVar.m(this);
        fVar.c();
        fVar.f16808c.append((char) 65533);
        lVar.f16823c = h1Var;
    }
}
