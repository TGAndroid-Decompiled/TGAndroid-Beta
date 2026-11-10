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
                        lVar.f8658c = b2.f8627r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8658c = b2.f8605a;
                    return;
                }
                lVar.a(b2.f8615f0);
                return;
            }
            lVar.a(b2.f8622n);
            return;
        }
        lVar.a(b2.f8616g0);
    }
}
