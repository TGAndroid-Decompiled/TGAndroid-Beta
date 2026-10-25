package gd;
public enum x0 extends a2 {
    public x0() {
        super("CommentStart", 44);
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
                        eVar.f12447c.append(d);
                        kVar.f12459c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f12459c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f12459c = vVar;
                return;
            }
            kVar.f12459c = a2.f12423i0;
            return;
        }
        kVar.m(this);
        eVar.f12447c.append((char) 65533);
        kVar.f12459c = z0Var;
    }
}
