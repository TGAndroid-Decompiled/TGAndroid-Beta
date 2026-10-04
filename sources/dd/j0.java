package dd;
public enum j0 extends b2 {
    public j0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.R;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.f(d);
                            lVar.f8308c = g0Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.f8308c = b2.f8255a;
                        return;
                    }
                    lVar.f(d);
                    lVar.f8308c = b2.f8264f;
                    return;
                }
                lVar.f(d);
                lVar.f8308c = b2.U;
                return;
            }
            lVar.f(d);
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f8308c = g0Var;
    }
}
