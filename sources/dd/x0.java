package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8362n.b();
            lVar.f8353c = b2.f8313i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8353c = b2.f8319o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8353c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8311g0);
        }
    }
}
