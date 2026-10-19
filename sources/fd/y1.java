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
                        kVar.f10569c = a2.f10542r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f10569c = a2.f10521a;
                    return;
                }
                kVar.a(a2.f10530f0);
                return;
            }
            kVar.a(a2.f10537n);
            return;
        }
        kVar.a(a2.f10531g0);
    }
}
