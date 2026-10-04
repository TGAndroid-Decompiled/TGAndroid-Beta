package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8316n.b();
            lVar.f8307c = b2.f8266h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8307c = b2.f8272n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8307c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8264f0);
        }
    }
}
