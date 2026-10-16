package fd;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f9135n.b();
            kVar.f9127c = a2.f9090h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f9127c = a2.f9096n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f9127c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f9088f0);
        }
    }
}
