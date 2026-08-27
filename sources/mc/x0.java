package mc;

public final enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f18016n.c();
            lVar.f18007c = b2.f17960d0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f18007c = b2.f17968j0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f18007c = b2.f17989z0;
        } else {
            lVar.m(this);
            lVar.a(b2.f17957b0);
        }
    }
}
