package ad;
public enum b2 extends c2 {
    public b2() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(m mVar, a aVar) {
        boolean j10 = aVar.j();
        x xVar = c2.f317a;
        if (j10) {
            mVar.l(this);
            mVar.h("</");
            mVar.f370c = xVar;
        } else if (aVar.o()) {
            mVar.d(false);
            mVar.f370c = c2.f339r;
        } else if (aVar.m('>')) {
            mVar.m(this);
            mVar.a(xVar);
        } else {
            mVar.m(this);
            mVar.a(c2.f328g0);
        }
    }
}
