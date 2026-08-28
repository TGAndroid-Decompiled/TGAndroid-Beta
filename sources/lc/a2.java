package lc;
public enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(l lVar, a aVar) {
        boolean j10 = aVar.j();
        w wVar = b2.f16770a;
        if (j10) {
            lVar.l(this);
            lVar.g("</");
            lVar.f16823c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.f16823c = b2.f16792r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.f16773b0);
        }
    }
}
