package fd;
public enum t extends a2 {
    public t() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.f10568c = a2.H;
            return;
        }
        kVar.h("</");
        kVar.f10568c = a2.f10528f;
    }
}
