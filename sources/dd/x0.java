package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8336n.b();
            lVar.f8327c = b2.f8287i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8327c = b2.f8293o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8327c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8285g0);
        }
    }
}
