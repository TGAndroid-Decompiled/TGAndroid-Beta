package nc;
public enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f17290c = b2.f17237a;
            return;
        }
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
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
