package dd;
public enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f7696c = b2.f7646a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    lVar.f(d);
                    lVar.f7696c = zVar;
                    return;
                }
                lVar.f7696c = b2.N;
                return;
            }
            lVar.f(d);
            lVar.f7696c = b2.M;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f7696c = zVar;
    }
}
