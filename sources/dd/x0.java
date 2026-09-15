package dd;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f7702n.b();
            lVar.f7694c = b2.f7655h0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f7694c = b2.f7661n0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f7694c = b2.D0;
        } else {
            lVar.m(this);
            lVar.a(b2.f7653f0);
        }
    }
}
