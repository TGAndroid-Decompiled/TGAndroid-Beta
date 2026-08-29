package nc;
public enum j0 extends b2 {
    public j0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        g0 g0Var = b2.N;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.f(d);
                            lVar.f17290c = g0Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.f17290c = b2.f17237a;
                        return;
                    }
                    lVar.f(d);
                    lVar.f17290c = b2.f17246f;
                    return;
                }
                lVar.f(d);
                lVar.f17290c = b2.Q;
                return;
            }
            lVar.f(d);
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f17290c = g0Var;
    }
}
