package ad;
public enum h0 extends c2 {
    public h0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char i3 = aVar.i();
        if (i3 != 0) {
            if (i3 != '-') {
                if (i3 != '<') {
                    if (i3 != 65535) {
                        mVar.h(aVar.g('-', '<', 0));
                        return;
                    }
                    mVar.l(this);
                    mVar.f370c = c2.f317a;
                    return;
                }
                mVar.f(i3);
                mVar.a(c2.V);
                return;
            }
            mVar.f(i3);
            mVar.a(c2.T);
            return;
        }
        mVar.m(this);
        aVar.a();
        mVar.f((char) 65533);
    }
}
