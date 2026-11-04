package ad;
public enum e0 extends c2 {
    public e0() {
        super("ScriptDataEscapedEndTagOpen", 25);
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
            mVar.a(c2.Q);
            return;
        }
        mVar.h("</");
        mVar.f370c = c2.L;
    }
}
