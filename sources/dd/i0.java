package dd;
public enum i0 extends b2 {
    public i0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.R;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != 65535) {
                        lVar.f(d);
                        lVar.f6778c = g0Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.f6778c = b2.f6726a;
                    return;
                }
                lVar.f(d);
                lVar.f6778c = b2.U;
                return;
            }
            lVar.f(d);
            lVar.f6778c = b2.T;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f6778c = g0Var;
    }
}
