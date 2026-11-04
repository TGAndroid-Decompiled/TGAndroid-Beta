package ad;
public enum y0 extends c2 {
    public y0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.k("--")) {
            mVar.f379n.b();
            mVar.f370c = c2.f330i0;
        } else if (aVar.l("DOCTYPE")) {
            mVar.f370c = c2.f336o0;
        } else if (aVar.k("[CDATA[")) {
            mVar.e();
            mVar.f370c = c2.E0;
        } else {
            mVar.m(this);
            mVar.a(c2.f328g0);
        }
    }
}
