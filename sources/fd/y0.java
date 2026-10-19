package fd;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10575n;
        char d = aVar.d();
        z0 z0Var = a2.f10532j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f10519a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f10555c.append(d);
                        kVar.f10567c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10567c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f10567c = vVar;
                return;
            }
            kVar.f10567c = a2.f10531i0;
            return;
        }
        kVar.m(this);
        eVar.f10555c.append((char) 65533);
        kVar.f10567c = z0Var;
    }
}
