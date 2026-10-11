package ed;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f8894n.b();
            lVar.f8885c = b2.f8844h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f8885c = b2.f8850n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f8885c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f8842f0);
        }
    }
}
