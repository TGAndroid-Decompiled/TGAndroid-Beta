package ad;
public enum a0 extends c2 {
    public a0() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.j()) {
            mVar.l(this);
            mVar.f370c = c2.f317a;
            return;
        }
        char i3 = aVar.i();
        if (i3 != 0) {
            if (i3 != '-') {
                if (i3 != '<') {
                    mVar.h(aVar.g('-', '<', 0));
                    return;
                } else {
                    mVar.a(c2.O);
                    return;
                }
            }
            mVar.f('-');
            mVar.a(c2.M);
            return;
        }
        mVar.m(this);
        aVar.a();
        mVar.f((char) 65533);
    }
}
