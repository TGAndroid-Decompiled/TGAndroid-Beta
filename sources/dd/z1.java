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
                        lVar.f8319c = b2.f8288r;
                        return;
                    }
                    lVar.m(this);
                    lVar.f('<');
                    lVar.f8319c = b2.f8266a;
                    return;
                }
                lVar.a(b2.f8277g0);
                return;
            }
            lVar.a(b2.f8283n);
            return;
        }
        lVar.a(b2.f8278h0);
    }
}
