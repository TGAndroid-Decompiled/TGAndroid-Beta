package ad;
public enum c0 extends c2 {
    public c0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(m mVar, a aVar) {
        if (aVar.j()) {
            mVar.l(this);
            mVar.f370c = c2.f317a;
            return;
        }
        char d = aVar.d();
        a0 a0Var = c2.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        mVar.f(d);
                        mVar.f370c = a0Var;
                        return;
                    }
                    mVar.f(d);
                    mVar.f370c = c2.f326f;
                    return;
                }
                mVar.f370c = c2.O;
                return;
            }
            mVar.f(d);
            return;
        }
        mVar.m(this);
        mVar.f((char) 65533);
        mVar.f370c = a0Var;
    }
}
