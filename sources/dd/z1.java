package dd;
public enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i7 = aVar.i();
        if (i7 != '!') {
            if (i7 != '/') {
                if (i7 != '?') {
                    if (aVar.o()) {
                        lVar.d(true);
                        lVar.f8324c = b2.f8293r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8324c = b2.f8271a;
                    return;
                }
                lVar.a(b2.f8282g0);
                return;
            }
            lVar.a(b2.f8288n);
            return;
        }
        lVar.a(b2.f8283h0);
    }
}
