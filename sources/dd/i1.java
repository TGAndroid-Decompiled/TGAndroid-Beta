package dd;
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f6477m;
        boolean j3 = aVar.j();
        w wVar = b2.f6420a;
        if (j3) {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.f6470c = wVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            lVar.j();
            lVar.a(wVar);
        } else if (aVar.l("PUBLIC")) {
            fVar.getClass();
            lVar.f6470c = b2.f6442r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.f6470c = b2.f6451x0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.C0);
        }
    }
}
