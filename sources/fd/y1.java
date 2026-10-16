package fd;
public enum y1 extends a2 {
    public y1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != '!') {
            if (i10 != '/') {
                if (i10 != '?') {
                    if (aVar.o()) {
                        kVar.d(true);
                        kVar.f9127c = a2.f9100r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f9127c = a2.f9079a;
                    return;
                }
                kVar.a(a2.f9088f0);
                return;
            }
            kVar.a(a2.f9095n);
            return;
        }
        kVar.a(a2.f9089g0);
    }
}
