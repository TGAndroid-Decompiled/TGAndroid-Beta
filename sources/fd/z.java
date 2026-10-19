package fd;
public enum z extends a2 {
    public z() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f10569c = a2.f10521a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    kVar.f(d);
                    kVar.f10569c = yVar;
                    return;
                }
                kVar.f10569c = a2.N;
                return;
            }
            kVar.f(d);
            kVar.f10569c = a2.M;
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f10569c = yVar;
    }
}
