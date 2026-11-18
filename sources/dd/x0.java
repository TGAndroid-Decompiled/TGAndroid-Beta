package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8333n.b();
            lVar.f8324c = b2.f8284i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8324c = b2.f8290o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8324c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8282g0);
        }
    }
}
