package lc;
public enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f16823c = b2.f16770a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.G;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    lVar.f(d);
                    lVar.f16823c = zVar;
                    return;
                }
                lVar.f16823c = b2.J;
                return;
            }
            lVar.f(d);
            lVar.f16823c = b2.I;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f16823c = zVar;
    }
}
