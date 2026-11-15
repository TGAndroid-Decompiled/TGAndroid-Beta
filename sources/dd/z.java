package dd;
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f8042c = b2.f7989a;
            return;
        }
        char i7 = aVar.i();
        if (i7 != 0) {
            if (i7 != '-') {
                if (i7 != '<') {
                    lVar.h(aVar.g('-', '<', 0));
                    return;
                } else {
                    lVar.a(b2.O);
                    return;
                }
            }
            lVar.f('-');
            lVar.a(b2.M);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
