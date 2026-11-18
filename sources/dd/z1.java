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
                        lVar.f8327c = b2.f8296r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8327c = b2.f8274a;
                    return;
                }
                lVar.a(b2.f8285g0);
                return;
            }
            lVar.a(b2.f8291n);
            return;
        }
        lVar.a(b2.f8286h0);
    }
}
