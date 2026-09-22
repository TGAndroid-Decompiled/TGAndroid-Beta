package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f7706n.b();
            lVar.f7698c = b2.f7659h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f7698c = b2.f7665n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f7698c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f7657f0);
        }
    }
}
