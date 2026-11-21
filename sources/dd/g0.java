package dd;
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i7 = aVar.i();
        if (i7 != 0) {
            if (i7 != '-') {
                if (i7 != '<') {
                    if (i7 != 65535) {
                        lVar.h(aVar.g('-', '<', 0));
                        return;
                    }
                    lVar.l(this);
                    lVar.f8353c = b2.f8300a;
                    return;
                }
                lVar.f(i7);
                lVar.a(b2.V);
                return;
            }
            lVar.f(i7);
            lVar.a(b2.T);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
