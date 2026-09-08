package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f6815n.b();
            lVar.f6806c = b2.f6765h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f6806c = b2.f6771n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f6806c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f6763f0);
        }
    }
}
