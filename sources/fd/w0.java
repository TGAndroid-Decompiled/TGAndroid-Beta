package fd;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f10575n.b();
            kVar.f10567c = a2.f10530h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f10567c = a2.f10536n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f10567c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f10528f0);
        }
    }
}
