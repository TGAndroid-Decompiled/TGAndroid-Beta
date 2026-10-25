package gd;
public enum y extends a2 {
    public y() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f12459c = a2.f12411a;
            return;
        }
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    kVar.h(aVar.g('-', '<', 0));
                    return;
                } else {
                    kVar.a(a2.N);
                    return;
                }
            }
            kVar.f('-');
            kVar.a(a2.L);
            return;
        }
        kVar.m(this);
        aVar.a();
        kVar.f((char) 65533);
    }
}
