package dd;
public enum b0 extends b2 {
    public b0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f8356c = b2.f8303a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        lVar.f(d);
                        lVar.f8356c = zVar;
                        return;
                    }
                    lVar.f(d);
                    lVar.f8356c = b2.f8312f;
                    return;
                }
                lVar.f8356c = b2.O;
                return;
            }
            lVar.f(d);
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f8356c = zVar;
    }
}
