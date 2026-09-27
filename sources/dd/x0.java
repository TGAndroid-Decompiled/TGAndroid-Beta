package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f7691n.b();
            lVar.f7683c = b2.f7644h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f7683c = b2.f7650n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f7683c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f7642f0);
        }
    }
}
