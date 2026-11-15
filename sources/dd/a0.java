package dd;
public enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f8042c = b2.f7989a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.L;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    lVar.f(d);
                    lVar.f8042c = zVar;
                    return;
                }
                lVar.f8042c = b2.O;
                return;
            }
            lVar.f(d);
            lVar.f8042c = b2.N;
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f8042c = zVar;
    }
}
