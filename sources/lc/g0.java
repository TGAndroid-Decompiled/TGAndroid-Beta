package lc;
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i9 = aVar.i();
        if (i9 != 0) {
            if (i9 != '-') {
                if (i9 != '<') {
                    if (i9 != 65535) {
                        lVar.g(aVar.g('-', '<', 0));
                        return;
                    }
                    lVar.l(this);
                    lVar.f16823c = b2.f16770a;
                    return;
                }
                lVar.f(i9);
                lVar.a(b2.Q);
                return;
            }
            lVar.f(i9);
            lVar.a(b2.O);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
