package dd;
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    if (i10 != 65535) {
                        lVar.h(aVar.g('-', '<', 0));
                        return;
                    }
                    lVar.l(this);
                    lVar.f6806c = b2.f6753a;
                    return;
                }
                lVar.f(i10);
                lVar.a(b2.U);
                return;
            }
            lVar.f(i10);
            lVar.a(b2.S);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
