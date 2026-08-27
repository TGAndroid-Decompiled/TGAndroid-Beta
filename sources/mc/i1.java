package mc;

public final enum i1 extends b2 {
    public i1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f18015m;
        boolean zJ = aVar.j();
        w wVar = b2.f17954a;
        if (zJ) {
            lVar.l(this);
            fVar.getClass();
            lVar.j();
            lVar.f18007c = wVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            lVar.j();
            lVar.a(wVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            lVar.f18007c = b2.f17972n0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            lVar.f18007c = b2.f17980t0;
        } else {
            lVar.m(this);
            fVar.getClass();
            lVar.a(b2.f17988y0);
        }
    }
}
