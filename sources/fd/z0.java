package fd;
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10576n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f10556c.append(aVar.g('-', 0));
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f10568c = a2.f10520a;
                return;
            }
            kVar.a(a2.f10534k0);
            return;
        }
        kVar.m(this);
        aVar.a();
        eVar.f10556c.append((char) 65533);
    }
}
