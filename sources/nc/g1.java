package nc;
public enum g1 extends b2 {
    public g1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        boolean o10 = aVar.o();
        h1 h1Var = b2.f17253l0;
        if (o10) {
            fVar.c();
            lVar.f17290c = h1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.c();
                        fVar.f17275c.append(d);
                        lVar.f17290c = h1Var;
                        return;
                    }
                    return;
                }
                lVar.l(this);
                fVar.c();
                fVar.getClass();
                lVar.j();
                lVar.f17290c = b2.f17237a;
                return;
            }
            return;
        }
        lVar.m(this);
        fVar.c();
        fVar.f17275c.append((char) 65533);
        lVar.f17290c = h1Var;
    }
}
