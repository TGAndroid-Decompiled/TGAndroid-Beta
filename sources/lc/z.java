package lc;
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f16823c = b2.f16770a;
            return;
        }
        char i9 = aVar.i();
        if (i9 != 0) {
            if (i9 != '-') {
                if (i9 != '<') {
                    lVar.g(aVar.g('-', '<', 0));
                    return;
                } else {
                    lVar.a(b2.J);
                    return;
                }
            }
            lVar.f('-');
            lVar.a(b2.H);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
