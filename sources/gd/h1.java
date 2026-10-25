package gd;
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f12466m;
        boolean j10 = aVar.j();
        v vVar = a2.f12411a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.f12459c = vVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
        } else if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.f12459c = a2.f12433r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.f12459c = a2.f12442x0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.C0);
        }
    }
}
