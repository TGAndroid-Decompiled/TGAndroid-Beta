package fd;
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10574m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.f10538p0;
        if (o10) {
            fVar.b();
            kVar.f10567c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.b();
                        fVar.f10556c.append(d);
                        kVar.f10567c = g1Var;
                        return;
                    }
                    return;
                }
                kVar.l(this);
                fVar.b();
                fVar.getClass();
                kVar.j();
                kVar.f10567c = a2.f10519a;
                return;
            }
            return;
        }
        kVar.m(this);
        fVar.b();
        fVar.f10556c.append((char) 65533);
        kVar.f10567c = g1Var;
    }
}
