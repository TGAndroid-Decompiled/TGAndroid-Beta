package gd;
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
                        kVar.f12458c = a2.f12431r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f12458c = a2.f12410a;
                    return;
                }
                kVar.a(a2.f12419f0);
                return;
            }
            kVar.a(a2.f12426n);
            return;
        }
        kVar.a(a2.f12420g0);
    }
}
