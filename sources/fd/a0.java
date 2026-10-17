package fd;
public enum a0 extends a2 {
    public a0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f10568c = a2.f10520a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        kVar.f(d);
                        kVar.f10568c = yVar;
                        return;
                    }
                    kVar.f(d);
                    kVar.f10568c = a2.f10528f;
                    return;
                }
                kVar.f10568c = a2.N;
                return;
            }
            kVar.f(d);
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f10568c = yVar;
    }
}
