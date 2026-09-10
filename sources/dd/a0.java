package dd;
public enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f6470c = b2.f6420a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    lVar.f(d);
                    lVar.f6470c = zVar;
                    return;
                }
                lVar.f6470c = b2.N;
                return;
            }
            lVar.f(d);
            lVar.f6470c = b2.M;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f6470c = zVar;
    }
}
