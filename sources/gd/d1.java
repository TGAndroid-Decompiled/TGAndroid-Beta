package gd;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f12467n;
        char d = aVar.d();
        z0 z0Var = a2.f12424j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f12411a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f12447c;
                        sb2.append("--!");
                        sb2.append(d);
                        kVar.f12459c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f12459c = vVar;
                    return;
                }
                kVar.i();
                kVar.f12459c = vVar;
                return;
            }
            eVar.f12447c.append("--!");
            kVar.f12459c = a2.f12425k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f12447c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f12459c = z0Var;
    }
}
