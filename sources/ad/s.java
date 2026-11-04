package ad;
public enum s extends c2 {
    public s() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.d(false);
            mVar.f370c = c2.F;
            return;
        }
        mVar.h("</");
        mVar.f370c = c2.f324e;
    }
}
