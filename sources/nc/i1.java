package nc;
public enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        boolean j10 = aVar.j();
        w wVar = b2.f17237a;
        if (j10) {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.f17290c = wVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            lVar.j();
            lVar.a(wVar);
        } else if (aVar.l("PUBLIC")) {
            fVar.getClass();
            lVar.f17290c = b2.f17255n0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.f17290c = b2.f17263t0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.f17271y0);
        }
    }
}
