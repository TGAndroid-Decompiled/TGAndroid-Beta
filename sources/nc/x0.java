package nc;
public enum x0 extends b2 {
    public x0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.k("--")) {
            lVar.f17299n.c();
            lVar.f17290c = b2.f17243d0;
        } else if (aVar.l("DOCTYPE")) {
            lVar.f17290c = b2.f17251j0;
        } else if (aVar.k("[CDATA[")) {
            lVar.e();
            lVar.f17290c = b2.f17272z0;
        } else {
            lVar.m(this);
            lVar.a(b2.f17240b0);
        }
    }
}
