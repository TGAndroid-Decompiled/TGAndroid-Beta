package gd;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f12467n;
        char d = aVar.d();
        z0 z0Var = a2.f12424j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f12447c;
                    sb2.append('-');
                    sb2.append(d);
                    kVar.f12459c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f12459c = a2.f12411a;
                return;
            }
            kVar.f12459c = a2.f12426l0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f12447c;
        sb3.append('-');
        sb3.append((char) 65533);
        kVar.f12459c = z0Var;
    }
}
