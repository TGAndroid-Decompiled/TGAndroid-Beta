package fd;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f10592n.b();
            kVar.f10584c = a2.f10547h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f10584c = a2.f10553n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f10584c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f10545f0);
        }
    }
}
