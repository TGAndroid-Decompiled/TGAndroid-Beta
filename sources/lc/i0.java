package lc;
public enum i0 extends b2 {
    public i0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.N;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != 65535) {
                        lVar.f(d);
                        lVar.f16823c = g0Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.f16823c = b2.f16770a;
                    return;
                }
                lVar.f(d);
                lVar.f16823c = b2.Q;
                return;
            }
            lVar.f(d);
            lVar.f16823c = b2.P;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f16823c = g0Var;
    }
}
