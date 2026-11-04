package ad;
public enum j1 extends c2 {
    public j1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(m mVar, a aVar) {
        g gVar = mVar.f378m;
        boolean j10 = aVar.j();
        x xVar = c2.f317a;
        if (j10) {
            mVar.l(this);
            gVar.getClass();
            mVar.j();
            mVar.f370c = xVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            mVar.j();
            mVar.a(xVar);
        } else if (aVar.l("PUBLIC")) {
            gVar.getClass();
            mVar.f370c = c2.f342s0;
        } else if (aVar.l("SYSTEM")) {
            gVar.getClass();
            mVar.f370c = c2.f351y0;
        } else {
            mVar.m(this);
            gVar.getClass();
            mVar.a(c2.D0);
        }
    }
}
