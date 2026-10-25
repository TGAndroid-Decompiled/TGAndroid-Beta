package gd;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f12467n.b();
            kVar.f12459c = a2.f12422h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f12459c = a2.f12428n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f12459c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f12420f0);
        }
    }
}
