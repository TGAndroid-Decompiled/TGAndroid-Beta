package dd;
public enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(l lVar, a aVar) {
        boolean j3 = aVar.j();
        w wVar = b2.f8303a;
        if (j3) {
            lVar.l(this);
            lVar.h("</");
            lVar.f8356c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.f8356c = b2.f8325r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.f8314g0);
        }
    }
}
