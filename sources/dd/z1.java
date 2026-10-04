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
                        lVar.f8307c = b2.f8276r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8307c = b2.f8254a;
                    return;
                }
                lVar.a(b2.f8264f0);
                return;
            }
            lVar.a(b2.f8271n);
            return;
        }
        lVar.a(b2.f8265g0);
    }
}
