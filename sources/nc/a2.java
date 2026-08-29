package nc;
public enum a2 extends b2 {
    public a2() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(l lVar, a aVar) {
        boolean j10 = aVar.j();
        w wVar = b2.f17237a;
        if (j10) {
            lVar.l(this);
            lVar.g("</");
            lVar.f17290c = wVar;
        } else if (aVar.o()) {
            lVar.d(false);
            lVar.f17290c = b2.f17259r;
        } else if (aVar.m('>')) {
            lVar.m(this);
            lVar.a(wVar);
        } else {
            lVar.m(this);
            lVar.a(b2.f17240b0);
        }
    }
}
