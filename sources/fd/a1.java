package fd;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10575n;
        char d = aVar.d();
        z0 z0Var = a2.f10532j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f10555c;
                    sb2.append('-');
                    sb2.append(d);
                    kVar.f10567c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f10567c = a2.f10519a;
                return;
            }
            kVar.f10567c = a2.f10534l0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f10555c;
        sb3.append('-');
        sb3.append((char) 65533);
        kVar.f10567c = z0Var;
    }
}
