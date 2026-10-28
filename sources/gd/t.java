package gd;
public enum t extends a2 {
    public t() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.f12458c = a2.H;
            return;
        }
        kVar.h("</");
        kVar.f12458c = a2.f12418f;
    }
}
