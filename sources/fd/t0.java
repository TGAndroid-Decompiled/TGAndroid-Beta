package fd;
public enum t0 extends a2 {
    public t0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        l0 l0Var = a2.W;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                v vVar = a2.f10520a;
                if (d != '>') {
                    if (d != 65535) {
                        kVar.m(this);
                        aVar.q();
                        kVar.f10568c = l0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.f10568c = vVar;
                    return;
                }
                kVar.k();
                kVar.f10568c = vVar;
                return;
            }
            kVar.f10568c = a2.f10527e0;
            return;
        }
        kVar.f10568c = l0Var;
    }
}
