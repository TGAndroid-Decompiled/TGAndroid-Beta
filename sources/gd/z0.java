package gd;
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f12467n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f12447c.append(aVar.g('-', 0));
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f12459c = a2.f12411a;
                return;
            }
            kVar.a(a2.f12425k0);
            return;
        }
        kVar.m(this);
        aVar.a();
        eVar.f12447c.append((char) 65533);
    }
}
