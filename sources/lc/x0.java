package lc;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f16832n.c();
            lVar.f16823c = b2.f16776d0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f16823c = b2.f16784j0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f16823c = b2.f16805z0;
        } else {
            lVar.m(this);
            lVar.a(b2.f16773b0);
        }
    }
}
