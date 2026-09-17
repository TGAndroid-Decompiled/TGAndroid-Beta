package dd;
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f6778c = b2.f6726a;
            return;
        }
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    lVar.h(aVar.g('-', '<', 0));
                    return;
                } else {
                    lVar.a(b2.N);
                    return;
                }
            }
            lVar.f('-');
            lVar.a(b2.L);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
