package dd;
public enum f1 extends b2 {
    public f1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8327m;
        char d = aVar.d();
        g1 g1Var = b2.f8286p0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    lVar.m(this);
                    lVar.f8319c = g1Var;
                    return;
                }
                lVar.l(this);
            }
            lVar.m(this);
            fVar.b();
            fVar.getClass();
            lVar.j();
            lVar.f8319c = b2.f8266a;
            return;
        }
        lVar.f8319c = g1Var;
    }
}
