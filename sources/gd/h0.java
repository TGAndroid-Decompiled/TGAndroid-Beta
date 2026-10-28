package gd;
public enum h0 extends a2 {
    public h0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.R;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != 65535) {
                        kVar.f(d);
                        kVar.f12458c = f0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.f12458c = a2.f12410a;
                    return;
                }
                kVar.f(d);
                kVar.f12458c = a2.U;
                return;
            }
            kVar.f(d);
            kVar.f12458c = a2.T;
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f12458c = f0Var;
    }
}
