package ad;
public enum b0 extends c2 {
    public b0() {
        super("ScriptDataEscapedDash", 22);
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
                    mVar.f(d);
                    mVar.f370c = a0Var;
                    return;
                }
                mVar.f370c = c2.O;
                return;
            }
            mVar.f(d);
            mVar.f370c = c2.N;
            return;
        }
        mVar.m(this);
        mVar.f((char) 65533);
        mVar.f370c = a0Var;
    }
}
