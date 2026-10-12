package ed;
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
                        lVar.f8883c = b2.f8852r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8883c = b2.f8830a;
                    return;
                }
                lVar.a(b2.f8840f0);
                return;
            }
            lVar.a(b2.f8847n);
            return;
        }
        lVar.a(b2.f8841g0);
    }
}
