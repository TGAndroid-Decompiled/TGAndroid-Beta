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
                        kVar.f12459c = a2.f12432r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f12459c = a2.f12411a;
                    return;
                }
                kVar.a(a2.f12420f0);
                return;
            }
            kVar.a(a2.f12427n);
            return;
        }
        kVar.a(a2.f12421g0);
    }
}
