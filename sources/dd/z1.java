package dd;
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != '!') {
            if (i10 != '/') {
                if (i10 != '?') {
                    if (aVar.o()) {
                        lVar.d(true);
                        lVar.f7693c = b2.f7664r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f7693c = b2.f7643a;
                    return;
                }
                lVar.a(b2.f7652f0);
                return;
            }
            lVar.a(b2.f7659n);
            return;
        }
        lVar.a(b2.f7653g0);
    }
}
