package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8327n.b();
            lVar.f8318c = b2.f8278i0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8318c = b2.f8284o0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8318c = b2.E0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8276g0);
        }
    }
}
