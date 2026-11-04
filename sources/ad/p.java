package ad;
public enum p extends c2 {
    public p() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.o()) {
            mVar.d(false);
            k kVar = mVar.f374i;
            char i3 = aVar.i();
            kVar.getClass();
            kVar.h(String.valueOf(i3));
            mVar.h.append(aVar.i());
            mVar.a(c2.f348x);
            return;
        }
        mVar.h("</");
        mVar.f370c = c2.f321c;
    }
}
