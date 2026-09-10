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
                        lVar.f6470c = b2.f6441r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f6470c = b2.f6420a;
                    return;
                }
                lVar.a(b2.f6429f0);
                return;
            }
            lVar.a(b2.f6436n);
            return;
        }
        lVar.a(b2.f6430g0);
    }
}
