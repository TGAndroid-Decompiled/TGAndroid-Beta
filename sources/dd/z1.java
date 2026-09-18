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
                        lVar.f7699c = b2.f7670r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f7699c = b2.f7649a;
                    return;
                }
                lVar.a(b2.f7658f0);
                return;
            }
            lVar.a(b2.f7665n);
            return;
        }
        lVar.a(b2.f7659g0);
    }
}
