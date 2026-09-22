package dd;
public enum b0 extends b2 {
    public b0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f7698c = b2.f7648a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        lVar.f(d);
                        lVar.f7698c = zVar;
                        return;
                    }
                    lVar.f(d);
                    lVar.f7698c = b2.f7656f;
                    return;
                }
                lVar.f7698c = b2.N;
                return;
            }
            lVar.f(d);
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f7698c = zVar;
    }
}
