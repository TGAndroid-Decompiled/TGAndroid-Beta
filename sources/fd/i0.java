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
                            kVar.f10567c = f0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.f10567c = a2.f10519a;
                        return;
                    }
                    kVar.f(d);
                    kVar.f10567c = a2.f10527f;
                    return;
                }
                kVar.f(d);
                kVar.f10567c = a2.U;
                return;
            }
            kVar.f(d);
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f10567c = f0Var;
    }
}
