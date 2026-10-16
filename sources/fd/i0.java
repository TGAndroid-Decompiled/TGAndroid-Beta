package fd;
public enum i0 extends a2 {
    public i0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.R;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.f(d);
                            kVar.f9127c = f0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.f9127c = a2.f9079a;
                        return;
                    }
                    kVar.f(d);
                    kVar.f9127c = a2.f9087f;
                    return;
                }
                kVar.f(d);
                kVar.f9127c = a2.U;
                return;
            }
            kVar.f(d);
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f9127c = f0Var;
    }
}
