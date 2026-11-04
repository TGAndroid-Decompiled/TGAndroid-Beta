package ad;
public enum j0 extends c2 {
    public j0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        h0 h0Var = c2.S;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != 65535) {
                        mVar.f(d);
                        mVar.f370c = h0Var;
                        return;
                    }
                    mVar.l(this);
                    mVar.f370c = c2.f317a;
                    return;
                }
                mVar.f(d);
                mVar.f370c = c2.V;
                return;
            }
            mVar.f(d);
            mVar.f370c = c2.U;
            return;
        }
        mVar.m(this);
        mVar.f((char) 65533);
        mVar.f370c = h0Var;
    }
}
