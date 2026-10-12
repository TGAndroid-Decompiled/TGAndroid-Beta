package ed;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8892n.b();
            lVar.f8883c = b2.f8842h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8883c = b2.f8848n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8883c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8840f0);
        }
    }
}
