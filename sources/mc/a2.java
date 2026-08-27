package mc;

public final enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(l lVar, a aVar) {
        boolean zJ = aVar.j();
        w wVar = b2.f17954a;
        if (zJ) {
            lVar.l(this);
            lVar.g("</");
            lVar.f18007c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.f18007c = b2.f17976r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.f17957b0);
        }
    }
}
